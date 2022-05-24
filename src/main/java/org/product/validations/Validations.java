package org.product.validations;

import org.product.domain.ProductDetails;

public class Validations {
	public static String validations(ProductDetails product) {
		String productName = product.getProductName();
		String brandName = product.getBrandName();
		String category = product.getCategory();
		Integer modelYear = (product.getModelYear());
		Double listPrice = (product.getListPrice());

		String error = "";
		if (productName == null || productName.trim().length() == 0) {
			error = "productName should not be empty";
		} else if (brandName == null || brandName.trim().length() == 0) {
			error = "brandName should not be empty";
		} else if (category == null || category.trim().length() == 0) {
			error = "category should not be empty";
		} else if ((modelYear) == null || String.valueOf(modelYear).trim().length() == 0) {
			error = "model year should not be empty";
		} else if ((listPrice) == null || String.valueOf(listPrice).trim().length() == 0) {
			error = "listPrice should not be empty";
		}

		return error;
	}
}
