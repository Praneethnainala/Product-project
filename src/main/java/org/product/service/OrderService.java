package org.product.service;

import java.util.List;

import org.product.domain.Order;

public interface OrderService {
	public List<Order> getAllOrder();

	public Order addOrder(Order order);

	public Order deleteOrder(int orderId);

	public Order getOrderId(int orderId);
	
	public List<Order> getProductOrder();
	
	public Order updateOrder(Order order);
	
	 
}
