package com.ektha.oms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ektha.oms.entity.Order;

@Component
public class OrderDAO extends BaseDAO implements IOrderDAO {

	private static String SQL_INSERT = "insert into test.orderdata(orderId, productId, orderQuantity, comments) values(?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.orderdata where id = ?";

	private static final String SQL_SELECT_QUERY = "select * from test.orderdata";

	private static final String SQL_UPDATE_QUERY = "Update test.orderdata set orderQuantity =? where id= ?";

	private static final String SQL_DELETE_QUERY = " delete from test.orderdata where id = ?";

	@Override
	public void add(Order order) {

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

			preparedStatement.setInt(1, order.getOrderId());
			preparedStatement.setInt(2, order.getProductId());
			preparedStatement.setInt(3, order.getOrderQuantity());
			preparedStatement.setString(4, order.getComments());

			int noOfRows = preparedStatement.executeUpdate();

			if (noOfRows == 1) {

				System.out.println("Order added successfully.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Order findByOrderId(int id) {

		Order order = null;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY_ID);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				order.setOrderId(resultSet.getInt("orderId"));
				order.setProductId(resultSet.getInt("id"));
				order.setOrderQuantity(resultSet.getInt("quantity"));
				order.setComments(resultSet.getString("comments"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return order;

	}

	@Override
	public List<Order> findAll() {

		ArrayList<Order> orderList = new ArrayList<Order>();

		try (Connection connection = getConnection()) {

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(SQL_SELECT_QUERY);

			while (resultSet.next()) {

				Order order = new Order();

				order.setOrderId(resultSet.getInt("orderId"));
				order.setProductId(resultSet.getInt("id"));
				order.setOrderQuantity(resultSet.getInt("quantity"));
				order.setComments(resultSet.getString("comments"));

				orderList.add(order);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderList;

	}

	@Override
	public boolean updateOrder(Order order) {

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_QUERY);
			preparedStatement.setInt(1, order.getOrderId());
			preparedStatement.setInt(2, order.getProductId());
			preparedStatement.setInt(3, order.getOrderQuantity());
			preparedStatement.setString(4, order.getComments());

			int resultSet = preparedStatement.executeUpdate();

			if (resultSet > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int id) {

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_QUERY);

			preparedStatement.setInt(1, id);

			int resultSet = preparedStatement.executeUpdate();

			if (resultSet > 0) {

				return true;
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return false;
	}

}
