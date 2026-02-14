package com.capgemini.BidirectionalOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int passportNumber;
	private String issueDate;
	private String expiryDate;
	@OneToOne(mappedBy = "passport")
	private Person person;
	public Passport() {
		super();
	}
	public Passport(int passportNumber, String issueDate, String expiryDate) {
		super();
		this.passportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", person=" + person + "]";
	}
	
}
