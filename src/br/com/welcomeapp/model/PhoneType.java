package br.com.welcomeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="phone_type")
public class PhoneType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "phone_type_seq_gen")
	@SequenceGenerator(name = "phone_type_seq_gen", sequenceName = "phone_type_id_seq")
	@Column(name = "id")
	private int id;
	
	private String type;
	
	@OneToOne(mappedBy = "phone_type")
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
