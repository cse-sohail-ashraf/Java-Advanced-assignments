/**
 * 
 */
package com.capgemini.assignmentQuestions1;

/**
 * 
 */
abstract class Person {
	private int id;
	private String name;
	private String department;
	private int yearsOfAssociation;
	public Person() {
		
	}
	public Person(int id, String name, String department, int yearsOfAssociation) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.yearsOfAssociation = yearsOfAssociation;
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
	public int getYearsOfAssociation() {
		return yearsOfAssociation;
	}
	public void setYearsOfAssociation(int yearsOfAssociation) {
		this.yearsOfAssociation = yearsOfAssociation;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", department=" + department + ", yerasOfAssociation="
				+ yearsOfAssociation + "]";
	}
	
}
