package org.product.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.product.domain.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductUtils {

	Logger logger = Logger.getLogger(ProductUtils.class.getName());
	@Autowired
	JdbcTemplate jdbc;

	public ProductDetails insertProductDetails(ProductDetails product) {

		String query1 = "insert into productinfo(productName,brandName,category,modelyear,listPrice) values(?,?,?,?,?)";
		jdbc.update(query1, product.getProductName(), product.getBrandName(), product.getCategory(),
				product.getModelYear(), product.getListPrice());

		logger.info("inserted id" + product.getProductId());
		return product;

	}

	public List<ProductDetails> getAllDetails() {
		List<ProductDetails> productList = new ArrayList<ProductDetails>();

		String query = "select * from productinfo";
		jdbc.execute(query);

		productList = jdbc.query(query,
				(rs, rowNum) -> (new ProductDetails(rs.getInt("productId"), rs.getString("productName"),
						rs.getString("brandName"), rs.getString("category"), rs.getInt("modelYear"),
						rs.getDouble("listPrice"))));

		logger.info("" + productList);
		return productList;

	}

	public ProductDetails deleteProduct(int productId) {

		String query2 = "DELETE FROM productinfo WHERE productId=?";
		jdbc.update(query2, productId);
		return null;

	}

	public ProductDetails getproduct(int productId) {

		String query1 = ("select * from productinfo where productId =?");
		Object[] args = { productId };
		ProductDetails product = jdbc.queryForObject(query1, args,
				BeanPropertyRowMapper.newInstance(ProductDetails.class));

		return product;

	}

	public ProductDetails updateProduct(ProductDetails product) {
		// TODO Auto-generated method stub
		String query = "update productinfo set productName=?,brandName=?,category=?,modelYear=?,listPrice=? where productId=?";
		jdbc.update(query, product.getProductName(), product.getBrandName(), product.getCategory(),
				product.getModelYear(), product.getListPrice(), product.getProductId());
//		Object[] args = {productId};
//				ProductDetails product1 = jdbc.queryForObject(query, args, BeanPropertyRowMapper.newInstance(ProductDetails.class));
//				
		logger.info("inserted id" + product.getProductId());
		return product;

	}

}