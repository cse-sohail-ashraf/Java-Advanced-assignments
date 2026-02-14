/**
 * 
 */
package com.capgemini.advance1.caseStudy;

/**
 * 
 */
class Employee {
	private int employeeId;
	private String name;
	private String department;
	private String designation;
	private int salary;
	private int yearsOfExperience;
	public Employee(int employeeId, String name, String department, String designation, int salary,
			int yearsOfExperience) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	
	
}
