package org.product.validations;

import java.util.Date;

import org.product.domain.Order;

public class OrderValidations {
	public static String OrderValidation(Order order) {
		Integer orderId = (order.getOrderId());
		String firstName = order.getFirstName();
		String middlename = order.getMiddleName();
		String lastName = order.getLastName();
		Long moblie = order.getMobile();
		String address = order.getAddress();
		Date orderDate = (order.getOrderDate());
		Date deliveryDate = (order.getDeliveryDate());
		Date returnDate = (order.getReturnDate());

		String error = "";
		if (orderId == null || String.valueOf(orderId).trim().length() == 0) {
			error = "orderId should not be empty";
		} else if (firstName == null || firstName.trim().length() == 0) {
			error = "firstName should not be empty";
		} else if (middlename == null || middlename.trim().length() == 0) {
			error = "middlename should not be empty";
		} else if (lastName == null || lastName.trim().length() == 0) {
			error = "lastName should not be empty";
		} else if (moblie == null || String.valueOf(moblie).trim().length() == 0) {
			error = "moblie should not be empty";
		} else if (address == null || address.trim().length() == 0) {
			error = "address should not be empty";
		} else if (orderDate == null || String.valueOf(orderDate).trim().length() == 0) {
			error = "orderDate should not be empty";
		} else if (deliveryDate == null || String.valueOf(deliveryDate).trim().length() == 0) {
			error = "deliveryDate year should not be empty";
		} else if (returnDate == null || String.valueOf(returnDate).trim().length() == 0) {
			error = "returnDate should not be empty";
		}

		return error;
	}
}
