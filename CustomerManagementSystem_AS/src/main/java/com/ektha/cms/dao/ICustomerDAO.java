package com.ektha.cms.dao;

import java.util.List;

import com.ektha.cms.entity.Customer;

public interface ICustomerDAO {

	void addProduct(Customer customer);

	Customer findById(int id);

	List<Customer> findAll();

	boolean updateCustomer(int id);

	boolean delete(int id);

}
