package com.ektha.login.entity;

public class Customer {

	String name;
	String userName;
	String password;

	public Customer() {

	}

	public Customer(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Customer [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}

}
