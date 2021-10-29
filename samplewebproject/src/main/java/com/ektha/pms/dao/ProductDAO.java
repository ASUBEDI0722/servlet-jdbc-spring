package com.ektha.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ektha.pms.entity.Product;

public class ProductDAO extends BaseDAO implements IProductDAO {

	private static String SQL_INSERT = "insert into test.product(id, name, price, description, quantity) values (?,?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.product where id=?";

	private static final String SQL_SELECT_QUERY = "select * from test.product";

	private static final String SQL_UPDATE_QUERY = "Update test.product set price =? where id= ?";

	private static final String SQL_DELETE_QUERY = " delete from test.product where id = ?";

	@Override
	public void add(Product product) {

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setInt(5, product.getQuantity());

			int noOfRows = preparedStatement.executeUpdate();

			if (noOfRows == 1) {

				System.out.println("Record added successfully.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Product findById(int id) {

		Product product = null;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY_ID);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				product = new Product();

				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				product.setQuantity(resultSet.getInt("quantity"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return product;

	}

	@Override
	public List<Product> findAll() {

		ArrayList<Product> productList = new ArrayList<Product>();

		try (Connection connection = getConnection()) {

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(SQL_SELECT_QUERY);

			while (resultSet.next()) {

				Product product = new Product();

				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				product.setQuantity(resultSet.getInt("quantity"));

				productList.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return productList;
	}

	@Override
	public boolean update(Product product) {

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_QUERY);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setFloat(2, product.getPrice());
			preparedStatement.setString(3, product.getDescription());
			preparedStatement.setInt(4, product.getQuantity());
			preparedStatement.setInt(5, product.getId());

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
