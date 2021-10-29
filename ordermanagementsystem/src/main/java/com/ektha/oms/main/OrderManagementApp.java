package com.ektha.oms.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ektha.oms.config.AppConfig;
import com.ektha.oms.dao.OrderDAO;
import com.ektha.oms.dao.IProductDAO;
import com.ektha.oms.dao.ProductDAO;
import com.ektha.oms.entity.Order;
import com.ektha.oms.entity.Product;

public class OrderManagementApp {

	public static void main(String[] args) {

		/* Update Order by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter order id");
//		int orderId = scanner.nextInt();
//
//		OrderDAO orderDAO;
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		orderDAO = applicationContext.getBean(OrderDAO.class);
//		Order order = orderDAO.findByOrderId(orderId);
//
//		if (order != null) {
//			System.out.println("Enter order quantity");
//			int orderQuantity = scanner.nextInt();
//
//			System.out.println("Enter order comments");
//			String orderComments = scanner.next();
//
//			order.setOrderQuantity(orderQuantity);
//			order.setComments(orderComments);
//
//			orderDAO.updateOrder(order);
//
//		} else {
//			System.out.println("Order ID doesn't exist");
//		}
//		((AnnotationConfigApplicationContext) applicationContext).close();
//
//		scanner.close();

//___________________________________________________________________________________________________		

		/* Update Product by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter product id");
//		int id = scanner.nextInt();
//
//		ProductDAO productDAO;
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		productDAO = applicationContext.getBean(ProductDAO.class);
//		Product product = productDAO.findById(id);
//
//		if (product != null) {
//			System.out.println("Enter product name");
//			String productName = scanner.next();
//
//			System.out.println("Enter product price");
//			float productPrice = scanner.nextFloat();
//
//			System.out.println("Enter product description");
//			String productDescription = scanner.next();
//
//			System.out.println("Enter product quantity");
//			int productQuantity = scanner.nextInt();
//			product.setName(productName);
//			product.setPrice(productPrice);
//			product.setDescription(productDescription);
//			product.setQuantity(productQuantity);
//
//			productDAO.updateProduct(product);
//
//		} else {
//			System.out.println("Product ID doesn't exist");
//		}
//		((AnnotationConfigApplicationContext) applicationContext).close();
//
//		scanner.close();

//______________________________________________________________________________________		

		/* Delete Order by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter order id");
//		int orderId = scanner.nextInt();
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		OrderDAO orderDAO = applicationContext.getBean(OrderDAO.class);
//		boolean order = orderDAO.delete(orderId);
//		System.out.println(order);
//		((AnnotationConfigApplicationContext) applicationContext).close();
//		scanner.close();

//________________________________________________________________________________________		

		/* Delete Product by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter product id");
//		int productId = scanner.nextInt();
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ProductDAO productDAO = applicationContext.getBean(ProductDAO.class);
//		boolean product = productDAO.delete(productId);
//		System.out.println(product);
//		((AnnotationConfigApplicationContext) applicationContext).close();

//____________________________________________________________________________________________		

		/* Find All Order */

//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		OrderDAO orderDAO = applicationContext.getBean(OrderDAO.class);
//		List <Order> order = orderDAO.findAll();
//		 ((AnnotationConfigApplicationContext)applicationContext).close();
//
//		 for (Order getOrder : order) {
//			System.out.println(getOrder);
//		}
//____________________________________________________________________________________________________________________		

		/* Find Order by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter order id.");
//		int orderId = scanner.nextInt();
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		OrderDAO orderDAO = applicationContext.getBean(OrderDAO.class);
//		Order order = orderDAO.findByOrderId(orderId);
//		System.out.println(order);
//		 ((AnnotationConfigApplicationContext)applicationContext).close();

//_____________________________________________________________________________________________________________________		

		/* Add Order */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter product id");
//		int productId = scanner.nextInt();
//
//		System.out.println("Enter product quantity");
//		int quantity = scanner.nextInt();
//
//		System.out.println("Enter comments.");
//		String comments = scanner.next();
//
//		Order order = new Order();
//		order.setProductId(productId);
//		order.setOrderQuantity(quantity);
//		order.setComments(comments);
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		OrderDAO orderDAO = applicationContext.getBean(OrderDAO.class);
//		orderDAO.add(order);
//		 ((AnnotationConfigApplicationContext)applicationContext).close();

//______________________________________________________________________________________________________________________________________________________________

		/* Add Product */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter product id");
//		int productId = scanner.nextInt();
//
//		System.out.println("Enter product name");
//		String productName = scanner.next();
//
//		System.out.println("Enter product price");
//		float productPrice = scanner.nextFloat();
//
//		System.out.println("Enter product description.");
//		String productDescription = scanner.next();
//
//		System.out.println("Enter product quantity");
//		int productQuantity = scanner.nextInt();
//
//		Product product = new Product();
//		product.setId(productId);
//		product.setName(productName);
//		product.setPrice(productPrice);
//		product.setDescription(productDescription);
//		product.setQuantity(productQuantity);
//		
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ektha.oms");
//		ProductDAO productDAO = applicationContext.getBean(ProductDAO.class);
//		productDAO.addProduct(product);
//		 ((AnnotationConfigApplicationContext)applicationContext).close();
//		scanner.close();

//	____________________________________________________________________________________________________________________________________________________________	

		/* Find Product by id */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter product id");
//		int productId = scanner.nextInt();
//
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ProductDAO productDAO = applicationContext.getBean(ProductDAO.class);
//		Product product = productDAO.findById(productId);
//		System.out.println(product);
//		((AnnotationConfigApplicationContext) applicationContext).close();
//		scanner.close();
//________________________________________________________________________________________________________________________________________________________________-		

		/* Find All Product */

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDAO productDAO = applicationContext.getBean(ProductDAO.class);
		 List<Product> product = productDAO.findALl();
		 ((AnnotationConfigApplicationContext)applicationContext).close();
		 
		 for(Product getProduct: product) {
			 
			 System.out.println(getProduct);
		 }
	}

}
