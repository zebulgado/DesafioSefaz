package br.com.welcomeapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.tools.javac.util.List;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "phone_seq_gen")
	@SequenceGenerator(name = "phone_seq_gen", sequenceName = "phone_id_seq")
	@Column(name = "id")
	private int id;

	private int ddd;
	
	private String number;
	
	@OneToMany(mappedBy = "phone", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<PhoneType> phoneTypes;
	
	@OneToMany(mappedBy = "phone", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<Ddd> dddList;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Phone() {
		
	}

	public Phone(int ddd, String number, List<PhoneType> phoneTypes, User user) {
		super();
		this.ddd = ddd;
		this.number = number;
		this.phoneTypes = phoneTypes;
		this.phoneTypes = phoneTypes;
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

	public List<PhoneType> getPhoneTypes() {
		return phoneTypes;
	}

	public void setPhoneTypes(List<PhoneType> phoneTypes) {
		this.phoneTypes = phoneTypes;
	}

	public List<Ddd> getDddList() {
		return dddList;
	}

	public void setDddList(List<Ddd> dddList) {
		this.dddList = dddList;
	}

	public User getUser() {
		return user;
	}
}
