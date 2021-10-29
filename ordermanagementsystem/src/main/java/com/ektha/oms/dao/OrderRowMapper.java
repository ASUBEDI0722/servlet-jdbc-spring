package com.ektha.oms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ektha.oms.entity.Order;

@Component("orderRowMapper")
public class OrderRowMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Order order = new Order();

		order.setOrderId(resultSet.getInt("orderId"));
		order.setProductId(resultSet.getInt("productId"));
		order.setOrderQuantity(resultSet.getInt("orderQuantity"));
		order.setComments(resultSet.getString("comments"));

		return order;

	}

}
