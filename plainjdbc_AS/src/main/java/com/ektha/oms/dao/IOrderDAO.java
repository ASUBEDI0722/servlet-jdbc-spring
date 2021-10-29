package com.ektha.oms.dao;

import java.util.List;

import com.ektha.oms.entity.Order;

public interface IOrderDAO {

	void add(Order order);

	Order findByOrderId(int id);

	List<Order> findAll();

	boolean updateOrder(Order order);

	boolean delete(int id);
}
