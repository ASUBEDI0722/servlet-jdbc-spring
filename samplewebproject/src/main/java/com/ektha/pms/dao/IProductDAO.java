package com.ektha.pms.dao;

import java.util.List;

import com.ektha.pms.entity.Product;

public interface IProductDAO {

	void add(Product product);

	Product findById(int id);

	List<Product> findAll();

	boolean update(Product product);

	boolean delete(int id);

}
