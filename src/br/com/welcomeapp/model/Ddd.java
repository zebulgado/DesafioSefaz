package br.com.welcomeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ddd")
public class Ddd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ddd_type_seq_gen")
	@SequenceGenerator(name = "ddd_type_seq_gen", sequenceName = "ddd_type_id_seq")
	private int id;
	
	private int prefix;
	
	@OneToOne(mappedBy = "ddd")
	private Phone phone;
	
	public Ddd() {
		
	}

	public Ddd(int prefix, Phone phone) {
		super();
		this.prefix = prefix;
		this.phone = phone;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
}
