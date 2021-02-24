package br.com.welcomeapp.model;

import com.sun.tools.javac.util.List;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String senha;
	private List<Phone> phones;

	public User() {
		
	}
	
	public User(String name, String email, String senha, List<Phone> phones) {
		super();
		this.name = name;
		this.email = email;
		this.senha = senha;
		this.phones = phones;
	}
	
	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
}
