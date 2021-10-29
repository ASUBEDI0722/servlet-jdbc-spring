package com.ektha.cms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.cms.entity.Customer;

@Repository
public class CustomerDAO implements ICustomerDAO {

	private static String SQL_INSERT = "insert into sys.customer(id, firstName, lastName, phoneNo, emailAddress) values (?,?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from sys.customer where id=?";

	private static final String SQL_SELECT_QUERY = "select * from sys.customer";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addProduct(Customer customer) {

		int noOfRows = jdbcTemplate.update(SQL_INSERT, customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getPhoneNo(), customer.getEmailAddress());
		
		
		if(noOfRows>1) {
			
			System.out.println("Record added successfully");
		}
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
