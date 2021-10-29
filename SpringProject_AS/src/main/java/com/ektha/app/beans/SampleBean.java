package com.ektha.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ektha.app.dao.MessageDAO;

@Component

public class SampleBean {
	
	@Autowired //this annotation indicates it is dependency and container will inject the dependency
	
	private MessageDAO messageDAO;	//messageDAO is dependency for sample bean
	
	
	//has to fetch from the database
	public String greet() {
		return "Welcome to Spring Framework!";
	}
	
	public String greetDBMessage() {
		
		
		//it will use messageDAO fetchMessage()
		
		return messageDAO.fetchMessage();
	}

}
