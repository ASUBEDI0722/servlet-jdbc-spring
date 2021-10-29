package com.ektha.oms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ektha.oms.entity.Product;

@Component

public class ProductDAO extends BaseDAO implements IProductDAO {

	private static String SQL_INSERT = "insert into test.product(id, name, price, description, quantity) values (?,?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.product where id=?";

	private static final String SQL_SELECT_QUERY = "select * from test.product";

	private static final String SQL_UPDATE_QUERY = "Update test.product set price =? where id= ?";

	private static final String SQL_DELETE_QUERY = " delete from test.product where id = ?";
	
	private static final String SQL_DELETE_DESCRIPTION_QUERY = " delete description from test.product where id = ?";


	@Override
	public void addProduct(Product product) {

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

		Product product = new Product();

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY_ID);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

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
	public List<Product> findALl() {

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
	public boolean updateProduct(int id, int orderQuantity) {

		try (Connection connection = getConnection()) {

			String SQL_UPDATE_QUERY = "Update test.product set quantity =? where id= ?";

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_QUERY);
			preparedStatement.setInt(1, orderQuantity);
			preparedStatement.setInt(2, id);

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
