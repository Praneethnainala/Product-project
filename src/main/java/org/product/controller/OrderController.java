package org.product.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.product.domain.Order;
import org.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class OrderController {
	@Autowired
	OrderService orderLink;
	Logger logger = Logger.getLogger(OrderController.class.getName());

	@GetMapping("/OrderaddPage")
	public String addOrders(ModelMap model, String productId) {
		model.addAttribute("productId", productId);
		model.addAttribute("order", new Order());
		return "Orderaddpage";
	}

	@PostMapping("/OrderaddPage")
	public String postOrder(@Valid @ModelAttribute Order order, BindingResult error, ModelMap model) {
		if (error.hasErrors()) {
			// uiModel.addAttribute("doctorRecord", new DoctorData());
			logger.info("error" + error);
			return "Orderaddpage";
		}
		orderLink.addOrder(order);
		logger.info("ADD ORDER");
		List<Order> orderList = orderLink.getAllOrder();
		model.addAttribute("orderList", orderList);

		return "Orderstable";

	}

	@GetMapping("/GetAllOrderPage")
	public String getOrders(ModelMap model) {
		List<Order> orderList = orderLink.getAllOrder();
		model.addAttribute("orderList", orderList);

		return "Orderstable";

	}

	@GetMapping("/DeleteOrdersPage")
	public String deleteOrder(ModelMap model, int orderId) {
		orderLink.deleteOrder(orderId);
		logger.info("ORDER DELETED");
		List<Order> orderList = orderLink.getAllOrder();
		model.addAttribute("orderList", orderList);
		logger.info("get all order method");
		return "Orderstable";

	}

	@GetMapping("/editOrderNew")
	public String getOrder(ModelMap model, int orderId, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		Order order = orderLink.getOrderId(orderId);
		model.addAttribute("order", order);

		return "editOrderNew";

	}

	@PostMapping("/editOrderNew")
	public String editOrder(@Valid @ModelAttribute("order") Order order, BindingResult error, ModelMap model,
			HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		if (error.hasErrors()) {
			// uiModel.addAttribute("doctorRecord", new DoctorData());
			logger.info("error" + error);
			return "Orderaddpage";
		}
		orderLink.updateOrder(order);
		List<Order> orderList = orderLink.getAllOrder();
		model.addAttribute("order", orderList);

		return "Orderstable";

	}

}
