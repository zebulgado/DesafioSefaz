package br.com.welcomeapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "phone_seq_gen")
	@SequenceGenerator(name = "phone_seq_gen", sequenceName = "phone_id_seq")
	@Column(name = "id")
	private int id;
	
	private String number;
	
	@OneToOne
	@JoinColumn(name="phone_type_id")
	private PhoneType phoneType;
	
	@OneToOne
	@JoinColumn(name="ddd_id")
	private Ddd ddd;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Phone() {
		
	}

	public Phone(String number, PhoneType phoneType, User user) {
		super();
		this.number = number;
		this.phoneType = phoneType;
		this.phoneType = phoneType;
		this.user = user;
	}
	
	public int getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneType getPhoneTypes() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public Ddd getDdd() {
		return ddd;
	}

	public void setDdd(Ddd ddd) {
		this.ddd = ddd;
	}

	public User getUser() {
		return user;
	}
}
