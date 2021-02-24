package br.com.welcomeapp.model;

public class PhoneType {
	
	private int id;
	private String type;
	private Phone phone;
	
	public PhoneType() {
		
	}

	public PhoneType(String type, Phone phone) {
		super();
		this.type = type;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
