package br.com.welcomeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.welcomeapp.model.Phone;
import br.com.welcomeapp.util.HibernateUtil;

public class PhoneDao {

	public void create(Phone phone) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(phone);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Phone readById(int id) {
		Transaction transaction = null;
		Phone phone = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			phone = session.get(Phone.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return phone;
	}
	
	public void delete(int id) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Phone phone = session.get(Phone.class, id);
			if (phone != null) {
				session.delete(phone);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Phone> readAll() {
		Transaction transaction = null;
		List<Phone> phones = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			phones = session.createQuery("from phone").getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return phones;
	}
}
