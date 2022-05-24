package org.product.controller;

import java.util.List;
import java.util.logging.Logger;

import org.product.domain.ProductDetails;
import org.product.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductRestController {

	Logger logger = Logger.getLogger(ProductRestController.class.getName());
	@Autowired
	ProductServices productLink;

	@GetMapping("rest/getAll")
	public List<ProductDetails> getProduct() {

		return productLink.getAllproduct();
	}

	@PostMapping("rest/addpage")
	public List<ProductDetails> Addproducts(@RequestBody ProductDetails product) {
		productLink.addproduct(product);
		return productLink.getAllproduct();

	}

	@PutMapping("rest/edit")
	public List<ProductDetails> editProduct(@RequestBody ProductDetails product) {
		productLink.updateProduct(product);
		return productLink.getAllproduct();
	}

	@DeleteMapping("rest/delete")
	public ProductDetails deleteproduct(@RequestParam int productId) {

		return productLink.deleteProduct(productId);
	}

}
