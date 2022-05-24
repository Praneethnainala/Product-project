package org.product.utils;

import java.util.List;

import org.product.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderUtils {
	@Autowired
	JdbcTemplate template;

	public List<Order> getAllOrder() {
		List<Order> orders;
		String query = "select * from orderinfo";
         template.execute(query);
		orders = template.query(query,
				(rs, rowNum) -> (new Order(rs.getInt("orderId"), rs.getString("firstName"), rs.getString("middlename"),
						rs.getString("lastName"), rs.getLong("mobile"), rs.getString("address"),
						rs.getDate("orderDate"), rs.getDate("deliveryDate"), rs.getDate("returnDate"),
						rs.getInt("productId"))));
		return orders;
	}

	public Order insertOrder(Order order) {
		String query = "insert into orderInfo(orderId,firstName,middlename,lastName,mobile,address,orderDate,deliveryDate,returnDate,productId)values (?,?,?,?,?,?,?,?,?,?)";
		template.update(query,order.getOrderId(),order.getFirstName(),order.getMiddleName(),order.getLastName(),order.getMobile(),order.getAddress(),order.getOrderDate(),order.getDeliveryDate(),order.getReturnDate(),order.getProductId());
		return order;
	}

	public void deleteOrder(int orderId) {
		String query = "delete from orderinfo where orderId=?";
		template.update(query, orderId);

	}

	public Order getByorderId(int orderId) {
		String query = "select * from orderinfo where orderId =?";
		Object[] args = { orderId };
		Order order = template.queryForObject(query, args, BeanPropertyRowMapper.newInstance(Order.class));
		return order;
	}

	public Order updateOrder(Order order) {
		String query = ("update orderinfo set firstName=?,middleName=?,lastName=?,mobile=?,address=?,productId=? where orderId=?");
		template.update(query, order.getFirstName(), order.getLastName(), order.getMiddleName(), order.getMobile(),
				order.getAddress(), order.getProductId(), order.getOrderId());
		return null;
	}

	public List<Order> getProductOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
