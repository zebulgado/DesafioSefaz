package br.com.welcomeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="phone_welcomeapp")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "phone_welcomeapp_seq_gen")
	@SequenceGenerator(name = "phone_welcomeapp_seq_gen", sequenceName = "phone_welcomeapp_id_seq")
	@Column(name = "id")
	private int id;
	
	@Column(name = "ddd")
	private int ddd;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "phone_types")
	private String phoneTypes;
	
	@ManyToOne
	@JoinColumn(name="user_welcomeapp_id")
	private User user;
	
	public Phone() {
		
	}

	public Phone(int ddd, String number, String phoneTypes) {
		super();
		this.ddd = ddd;
		this.number = number;
		this.phoneTypes = phoneTypes;
		this.phoneTypes = phoneTypes;
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

	public String getPhoneTypes() {
		return phoneTypes;
	}

	public void setPhoneTypes(String phoneTypes) {
		this.phoneTypes = phoneTypes;
	}

	public User getUser() {
		return user;
	}
	
	public String dddWithNumber() {
		String result = this.ddd + this.number;
		return result;
	}
}
