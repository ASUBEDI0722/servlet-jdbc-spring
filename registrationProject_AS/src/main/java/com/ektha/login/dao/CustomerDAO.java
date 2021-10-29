package com.ektha.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ektha.login.entity.Customer;

public class CustomerDAO extends BaseDAO implements ICustomerDAO {

	private static String SQL_INSERT = "insert into test.customer(name, userName, password) values (?,?,?)";

	private static final String SQL_SELECT_QUERY = "select * from test.customer where userName = ? && password = ?";

	@Override
	public int insertCustomer(Customer customer) {

		int noOfRows = 0;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getUserName());
			preparedStatement.setString(3, customer.getPassword());

			noOfRows = preparedStatement.executeUpdate();

			if (noOfRows == 1) {

				System.out.println("Record added successfully.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return noOfRows;
	}

	@Override
	public Customer getCustomer(String userName, String password) {

		Customer customer = new Customer();

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				customer.setName(resultSet.getString(1));
				customer.setUserName(resultSet.getString(2));
				customer.setPassword(resultSet.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}

//	public static void main(String[] args) {

//		Customer customer = new Customer("Anamika", "asubedi", "Nepal");
//		CustomerDAO customerDAO = new CustomerDAO();
//		customerDAO.insertCustomer(customer);
//		
//		Customer customer = customerDAO.getCustomer("asubedi", "Nepal");
//		customer.getName();
//		customer.getUserName();
//		customer.getPassword();
//		System.out.println(customer);

//		Customer customer = new Customer();
//		customer = customerDAO.getCustomer("asubedi", "Nepal");
//		customer.getName();
//		customer.getUserName();
//		customer.getPassword();
//		
//		System.out.println(customer);

//	}

}
