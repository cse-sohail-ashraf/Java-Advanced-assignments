package com.capgemini.EmployeeOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Locker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int lockerNumber;
	private int floor;
	public Locker() {
		super();
	}
	public Locker(int lockerNumber, int floor) {
		super();
		this.lockerNumber = lockerNumber;
		this.floor = floor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLockerNumber() {
		return lockerNumber;
	}
	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Locker [id=" + id + ", lockerNumber=" + lockerNumber + ", floor=" + floor + "]";
	}
	
	
}
