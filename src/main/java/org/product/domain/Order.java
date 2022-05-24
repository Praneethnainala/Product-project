package org.product.domain;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Order {

	public Integer orderId;
	@NotNull
	@Size(min = 3, max = 10, message = "enter first name correctly")
	public String firstName;
	@NotNull
	@Size(min = 3, max = 10, message = "enter middle name correctly")
	public String middleName;
	@NotNull
	@Size(min = 10, max = 10, message = "enter last name correctly")
	public String lastName;
	@NotNull
	protected Long mobile;
	@NotEmpty
	private String address;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public Date orderDate;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public Date deliveryDate;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public Date returnDate;
	@NotNull
	public Integer productId;

	public Order(Integer orderId, String firstName, String middleName, String lastName, Long moblie, String address,
			Date orderDate, Date deliveryDate, Date returnDate, Integer productId) {
		super();
		this.orderId = orderId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobile = moblie;
		this.address = address;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.returnDate = returnDate;
		this.productId = productId;
	}

	public Order() {

	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long moblie) {
		this.mobile = moblie;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mobile=" + mobile + ", address=" + address + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", returnDate=" + returnDate + ", productId=" + productId + "]";
	}

}
