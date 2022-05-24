package org.product.domain;

public class ProductDetails {
	private Integer productId;
	private String productName;
	private String brandName;
	private String category;
	private Integer modelYear;
	private Double listPrice;

	public ProductDetails(Integer productID, String productName, String brandName, String category, Integer modelYear,
			Double listPrice) {
		super();
		this.productId = productID;
		this.productName = productName;
		this.brandName = brandName;
		this.category = category;
		this.modelYear = modelYear;
		this.listPrice = listPrice;

	}

	public ProductDetails() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", brandName=" + brandName
				+ ", category=" + category + ", modelYear=" + modelYear + ", listPrice=" + listPrice + "]";
	}


}
