package com.capgemini.EmployeeOneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String department;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lockerId")
	Locker locker;
	public Employee() {
		super();
	}
	
	
	public Employee(String name, String department, Locker locker) {
		super();
		this.name = name;
		this.department = department;
		this.locker = locker;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Locker getLocker() {
		return locker;
	}
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", locker=" + locker + "]";
	}
}
