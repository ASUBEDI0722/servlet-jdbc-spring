package com.ektha.oms.entity;

import java.util.Objects;

public class Order {

	private int orderId;
	private int productId;
	private int orderQuantity;
	private String comments;

	public Order() {

	}

	public Order(int orderId, int productId, int orderQuantity, String comments) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderQuantity = orderQuantity;
		this.comments = comments;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", orderQuantity=" + orderQuantity
				+ ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, orderId, orderQuantity, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(comments, other.comments) && orderId == other.orderId
				&& orderQuantity == other.orderQuantity && productId == other.productId;
	}

}
