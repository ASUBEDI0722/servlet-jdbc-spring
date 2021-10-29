package com.ektha.cms.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ektha.cms.dao.CustomerDAO;
import com.ektha.cms.dao.ICustomerDAO;
import com.ektha.cms.entity.Customer;

public class Test {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Anamika");
		customer.setLastName("Subedi");
		customer.setPhoneNo("32789067");
		customer.setEmailAddress("asubedi@gmail.com");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/CustomerManagementSystem_AS/src/test/resources/application-context.xml");
		ICustomerDAO customerDAO = applicationContext.getBean(CustomerDAO.class);
		customerDAO.addProduct(customer);

	}

}
