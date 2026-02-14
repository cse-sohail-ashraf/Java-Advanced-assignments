package com.capgemini.Task1;

public class LoginValidationSystem {
	private String userName;
	private String password;
	
	public LoginValidationSystem() {
		super();
	}
	public LoginValidationSystem(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkUserName(String userName) {
		if(userName == null || userName.length() == 0 || userName.length() <= 5 || userName.length() >= 15) return false;
		for(int i = 0; i < userName.length(); i++) {
			char ch = userName.charAt(i);
			if(!(Character.isDigit(ch) || Character.isAlphabetic(ch))) return false;
		}
		return true;
	}
	public boolean checkUserPassword(String password) {
		if(password == null || password.length() == 0 || password.length() < 8) return false;
		boolean digitFlag = false,alphabetFlag = false,specialCharFlag = false;
		String specialCharacters = "@$!%?&";
		for(int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(Character.isDigit(ch)) digitFlag = true;
			if(Character.isAlphabetic(ch)) alphabetFlag = true;
			if(specialCharacters.indexOf(ch) >= 0) specialCharFlag = true;
		}
		return (digitFlag && alphabetFlag && specialCharFlag);
	}
}
