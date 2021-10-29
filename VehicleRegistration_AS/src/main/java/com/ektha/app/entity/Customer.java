package com.ektha.app.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Customer {
	
	private String firstName;
	private String lastName;
	private String driverLicense;
	
	

}
