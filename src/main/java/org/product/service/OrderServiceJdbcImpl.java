package org.product.service;

import java.util.List;

import org.product.domain.Order;
import org.product.utils.OrderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceJdbcImpl implements OrderService {
	@Autowired
	OrderUtils o = new OrderUtils();

	@Override
	public List<Order> getAllOrder() {
		return o.getAllOrder();
	}

	@Override
	public Order addOrder(Order order) {
		Order orders = o.insertOrder(order);
		return orders;
	}

	@Override
	public Order deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		o.deleteOrder(orderId);
		return null;
	}

	@Override
	public Order getOrderId(int orderId) {
		// TODO Auto-generated method stub

		return o.getByorderId(orderId);
	}

	@Override
	public List<Order> getProductOrder() {

		return o.getProductOrderDetails();
	}

	@Override
	public Order updateOrder(Order order) {

		return o.updateOrder(order);
	}

}
