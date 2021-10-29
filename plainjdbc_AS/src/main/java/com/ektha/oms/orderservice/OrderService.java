package com.ektha.oms.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ektha.oms.dao.OrderDAO;
import com.ektha.oms.dao.ProductDAO;
import com.ektha.oms.entity.Order;
import com.ektha.oms.entity.Product;

@Component
public class OrderService {

	@Autowired
	ProductDAO productDAO;

	@Autowired
	OrderDAO orderDAO;

	public boolean processOrder(Order order) {

		Product product = productDAO.findById(order.getProductId());

		int productId = order.getProductId();

		{

			if (order.getOrderQuantity() <= product.getQuantity()) {

				orderDAO.add(order);

				int availableQuantity = product.getQuantity() - order.getOrderQuantity();

				productDAO.updateProduct(productId, availableQuantity);

				return true;

			}
		}
		return false;

	}

}
