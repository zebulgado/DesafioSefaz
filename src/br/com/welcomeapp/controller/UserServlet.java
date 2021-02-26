package br.com.welcomeapp.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.welcomeapp.util.Constants;
import br.com.welcomeapp.dao.PhoneDao;
import br.com.welcomeapp.dao.UserDao;
import br.com.welcomeapp.model.Phone;
import br.com.welcomeapp.model.User;

@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	private PhoneDao phoneDao;
	
	public void init() {
		userDao = new UserDao();
		phoneDao = new PhoneDao();
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	@SuppressWarnings({ "unused"})
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter(Constants.ACTION_KEY);
		
		try {
			if(action.equalsIgnoreCase(Constants.LIST_ACTION)) {
				list(request, response);
			}
			else if (action.equalsIgnoreCase(Constants.CREATE_ACTION)) {
				newUser(request, response);
			} else if (action.equalsIgnoreCase(Constants.INSERT_ACTION)) {
				insert(request, response);
			} else if (action.equalsIgnoreCase(Constants.DELETE_ACTION)) {
				delete(request, response);
			} else if (action.equalsIgnoreCase(Constants.EDIT_ACTION)) {
				editUser(request, response);
			} else if (action.equalsIgnoreCase(Constants.UPDATE_ACTION)) {
				update(request, response);
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> users = userDao.readAll();
		request.setAttribute("user", users);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp"); //
		dispatcher.forward(request, response);
	}
	
	private void newUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-new.jsp");
		dispatcher.forward(request, response);
	}
	
	private void insert(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter(Constants.USER_COL_NAME);
		String email = request.getParameter(Constants.USER_COL_EMAIL);
		String password = null;
		try {
			password = crypto(request.getParameter(Constants.USER_COL_PASSWORD));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		int ddd = Integer.parseInt(request.getParameter(Constants.PHONE_COL_DDD));
		String number = request.getParameter(Constants.PHONE_COL_NUMBER);
		String phoneType = request.getParameter(Constants.PHONE_COL_PHONE_TYPE);
		
		User user = new User(name, email, password);
		User createdUser = null;
		createdUser = userDao.create(user);

		Phone phone = new Phone(ddd, number, phoneType, createdUser);
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(phone);
		phoneDao.create(phone);
		
		response.sendRedirect(request.getContextPath());
	}
	
	private void editUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter(Constants.USER_COL_ID));
		User user = userDao.readById(id);
		user.setPassword(null);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-update.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter(Constants.USER_COL_ID));
		String name = request.getParameter(Constants.USER_COL_NAME);
		String email = request.getParameter(Constants.USER_COL_EMAIL);
		String password = null;
		try {
			password = crypto(request.getParameter(Constants.USER_COL_PASSWORD));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		int ddd = Integer.parseInt(request.getParameter(Constants.PHONE_COL_DDD));
		String number = request.getParameter(Constants.PHONE_COL_NUMBER);
		String phoneType = request.getParameter(Constants.PHONE_COL_PHONE_TYPE);
		
		Phone phone = new Phone(ddd, number, phoneType);
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(phone);
		User user = new User(id, name, email, password, phones);
		
		userDao.update(user);
		response.sendRedirect(request.getContextPath());
	}
	
	private void delete(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter(Constants.USER_COL_ID));
		
		userDao.delete(id);
		response.sendRedirect(request.getContextPath());
	}
	
	public static String crypto(String pass) throws NoSuchAlgorithmException {

	       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
	       byte messageDigest[] = algorithm.digest(pass.getBytes(StandardCharsets.UTF_8));
	       StringBuilder hexString = new StringBuilder();
	       for (byte b : messageDigest) { 
	         hexString.append(String.format("%02X", 0xFF & b));
	       }
	       String password = hexString.toString();

	       return password;
	}
	
	
}
