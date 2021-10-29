package com.ektha.oms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.oms.entity.Order;

@Repository
public class OrderDAO implements IOrderDAO {

	private static String SQL_INSERT = "insert into test.orderdata(orderId, productId, orderQuantity, comments) values(?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.orderdata where orderId = ?";

	private static final String SQL_SELECT_QUERY = "select * from test.orderdata";

	private static final String SQL_DELETE_QUERY = " delete from test.orderdata where orderId = ?";

	private static final String SQL_UPDATE_QUERY = "update test.orderdata set orderQuantity = ?, comments =? where orderId =?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private OrderRowMapper orderRowMapper;

	@Override
	public void add(Order order) {

		int noOfRows = jdbcTemplate.update(SQL_INSERT, order.getOrderId(), order.getProductId(),
				order.getOrderQuantity(), order.getComments());

		if (noOfRows == 1) {

			System.out.println("Order added successsfully.");
		}

	}

	@Override
	public Order findByOrderId(int orderId) {

		Order order = jdbcTemplate.queryForObject(SQL_SELECT_QUERY_ID, orderRowMapper, orderId);

		return order;
	}

	@Override
	public List<Order> findAll() {

		List<Order> orderList = jdbcTemplate.query(SQL_SELECT_QUERY, orderRowMapper);
		return orderList;
	}

	@Override
	public boolean updateOrder(Order order) {

		int updateOrder = jdbcTemplate.update(SQL_UPDATE_QUERY, order.getOrderQuantity(), order.getComments(),
				order.getOrderId());

		if (updateOrder == 1) {

			System.out.println("Order updated successfully.");
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {

		int deleteOrder = jdbcTemplate.update(SQL_DELETE_QUERY, id);

		if (deleteOrder == 1) {

			System.out.println("Order deleted successfully");
			return true;
		}

		return false;
	}

}
