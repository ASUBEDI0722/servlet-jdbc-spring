package com.ektha.oms.dao;

import java.util.List;

import com.ektha.oms.entity.Product;

public interface IProductDAO {

	void addProduct(Product product);

	Product findById(int id);

	List<Product> findALl();

	boolean updateProduct(int productId, int orderQuantity);

	boolean delete(int id);

}
