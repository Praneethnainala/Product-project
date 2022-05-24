package org.product.controller;

import java.util.List;
import java.util.logging.Logger;

import org.product.domain.Order;
import org.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRest {
	@Autowired
	OrderService orderLink;
	Logger logger = Logger.getLogger(OrderRest.class.getName());

	@PostMapping("/addPage")
	public List<Order> postOrder(@RequestBody Order order) {

		orderLink.addOrder(order);
		logger.info("ADD ORDER");

		return orderLink.getAllOrder();

	}

	@GetMapping("get")
	public List<Order> orderGet() {
		return orderLink.getAllOrder();

	}

	@PutMapping("edit")
	public List<Order> orderEdit(@RequestBody Order order) {
		orderLink.updateOrder(order);
		return orderLink.getAllOrder();

	}

	@DeleteMapping("delete")
	public Order ordeDelete(int orderId) {

		return orderLink.deleteOrder(orderId);

	}

	@GetMapping("search")
	public Order search(int orderId) {
		return orderLink.getOrderId(orderId);

	}
}
