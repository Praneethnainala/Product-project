package org.product.service;

import java.util.List;
import java.util.Map;

import org.product.domain.ProductDetails;

public interface ProductServices {
	public List<ProductDetails> getAllproduct();

	public List<ProductDetails> addproduct(ProductDetails product);

	public ProductDetails getProductsByProductId(int productId);

	public ProductDetails deleteProduct(int productId);

	public ProductDetails updateProduct(ProductDetails product);

	public Map<Integer, ProductDetails> addInMaps(ProductDetails product);

}
