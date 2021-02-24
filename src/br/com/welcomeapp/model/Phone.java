package br.com.welcomeapp.model;

import com.sun.tools.javac.util.List;

public class Phone {
	
	private int id;
	private int ddd;
	private String number;
	private List<PhoneType> phonetypes;
	private User user;
	
	public Phone() {
		
	}

	public Phone(int ddd, String number, List<PhoneType> phonetypes, User user) {
		super();
		this.ddd = ddd;
		this.number = number;
		this.phonetypes = phonetypes;
		this.user = user;
	}
	
	public int getId() {
		return id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<PhoneType> getPhonetypes() {
		return phonetypes;
	}

	public void setPhonetypes(List<PhoneType> phonetypes) {
		this.phonetypes = phonetypes;
	}

	public User getUser() {
		return user;
	}
}
