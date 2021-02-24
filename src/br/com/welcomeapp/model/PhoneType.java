package br.com.welcomeapp.model;

public class PhoneType {
	
	private int id;
	private String type;
	
	public PhoneType() {
		
	}

	public PhoneType(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	
}
