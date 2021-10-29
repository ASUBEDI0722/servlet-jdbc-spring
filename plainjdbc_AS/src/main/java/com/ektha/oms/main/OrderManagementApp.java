package com.ektha.oms.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ektha.oms.entity.Order;

import com.ektha.oms.orderservice.OrderService;

public class OrderManagementApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter product id.");
		int productId = scanner.nextInt();

		System.out.println("Enter the quantity.");
		int quantity = scanner.nextInt();

		System.out.println("Enter comments");
		String comments = scanner.next();

		Order order = new Order();
		order.setProductId(productId);
		order.setOrderQuantity(quantity);
		order.setComments(comments);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ektha.oms");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.processOrder(order);
	}

}
