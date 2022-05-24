package org.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.product.domain.ProductDetails;
import org.product.utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductJDBCImpl implements ProductServices {
	@Autowired
	ProductUtils link;
	List<ProductDetails> productList = new ArrayList<>();

	@Override
	public ProductDetails getProductsByProductId(int productID) {
		// TODO Auto-generated method stub
		return link.getproduct(productID);
	}

	@Override
	public List<ProductDetails> addproduct(ProductDetails product) {
		// link.insertProductDetails(product);
		// TODO Auto-generated method stub
		productList.add(link.insertProductDetails(product));
		return productList;
	}

	@Override
	public List<ProductDetails> getAllproduct() {
		// TODO Auto-generated method stub
		return link.getAllDetails();
	}

	@Override
	public ProductDetails deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
		return link.deleteProduct(productId);
	}

	public Map<Integer, ProductDetails> addInMaps(ProductDetails product) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ProductDetails updateProduct(ProductDetails product) {
		
		return link.updateProduct(product);
	}

}
