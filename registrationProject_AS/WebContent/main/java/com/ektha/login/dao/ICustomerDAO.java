package com.ektha.login.dao;

import com.ektha.login.entity.Customer;

public interface ICustomerDAO {

	public int insertCustomer(Customer customer);

	public Customer getCustomer(String userName, String password);

}
