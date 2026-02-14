package com.capgemini.BidirectionalOneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String DOB;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id")
	private Passport passport;

	public Person() {
		super();
	}

	public Person(String name, String dOB, Passport passport) {
		super();
		this.name = name;
		DOB = dOB;
		this.passport = passport;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", DOB=" + DOB + ", passport=" + passport + "]";
	}
	
}
