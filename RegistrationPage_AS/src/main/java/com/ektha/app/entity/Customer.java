package com.ektha.app.entity;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String Gender;
	private String email;
	private String city;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, String gender, String email, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		this.email = email;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Gender=" + Gender
				+ ", email=" + email + ", city=" + city + "]";
	}

}
