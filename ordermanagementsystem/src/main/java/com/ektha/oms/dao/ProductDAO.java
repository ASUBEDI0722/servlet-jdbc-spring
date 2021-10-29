package com.ektha.oms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.oms.entity.Product;

@Repository
public class ProductDAO implements IProductDAO {

	private static String SQL_INSERT = "insert into test.product(id, name, price, description, quantity) values (?,?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.product where id=?";

	private static final String SQL_SELECT_QUERY = "select * from test.product";

	private static final String SQL_UPDATE_QUERY = "update test.product set name=?, price=?, description=?, quantity=? where id =? ";

	private static final String SQL_DELETE_QUERY = " delete from test.product where id = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProductRowMapper productRowMapper;

	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addProduct(Product product) {

		int noOfRows = jdbcTemplate.update(SQL_INSERT, product.getId(), product.getName(), product.getPrice(),
				product.getDescription(), product.getQuantity());

		if (noOfRows == 1) {

			System.out.println("Record added successsfully.");
		}
	}

	@Override
	public Product findById(int id) {

		Product product = jdbcTemplate.queryForObject(SQL_SELECT_QUERY_ID, productRowMapper, id);

		return product;
	}

	@Override
	public List<Product> findALl() {
		List<Product> productList = jdbcTemplate.query(SQL_SELECT_QUERY, productRowMapper);
		return productList;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		int updateProduct = jdbcTemplate.update(SQL_UPDATE_QUERY, product.getName(), product.getPrice(), product.getDescription(), product.getQuantity(), product.getId());
		
		if(updateProduct ==1 ) {
			
			System.out.println("Product updated successfully.");
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {

		int deleteProduct = jdbcTemplate.update(SQL_DELETE_QUERY, id);

		if (deleteProduct == 1) {
			System.out.println("Product deleted successfully.");
			return true;
		}

		return false;
	}

}
