package org.product.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.product.domain.ProductDetails;
import org.product.service.ProductServices;
import org.product.validations.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
	Logger logger = Logger.getLogger(ProductController.class.getName());
	@Autowired
	ProductServices productLink;

	@GetMapping("/addpage")
	public String Addproduct() {

		return "product";

	}

	@PostMapping("/addpage")
	public String Addproducts(@ModelAttribute ProductDetails product, ModelMap model, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		String error = Validations.validations(product);
		if (error != null && error.trim().length() > 0) {
			model.addAttribute("updatedProduct", product);
			model.addAttribute("errorflieds", error);
			return "product";
		}
		productLink.addproduct(product);

		logger.info("added product data");
		List<ProductDetails> productList = productLink.getAllproduct();
		logger.info("getting products");
		model.addAttribute("productList", productList);
		return "producttable";

	}

	@GetMapping("/getallpage")
	public String getProduct(ModelMap model, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		List<ProductDetails> productList = productLink.getAllproduct();
		logger.info("getting products");
		model.addAttribute("productList", productList);
		return "producttable";
	}

	@GetMapping("/editpage")
	public String editProduct(ModelMap model, int productId, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		ProductDetails updatedProduct = productLink.getProductsByProductId(productId);

		logger.info("getting product" + updatedProduct);
		model.addAttribute("updatedProduct", updatedProduct);
		return "Editpage";

	}

	@PostMapping("/editpage")
	public String editProduct1(ModelMap model, ProductDetails product, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		String error = Validations.validations(product);
		if (error != null && error.trim().length() > 0) {
			model.addAttribute("updatedProduct", product);
			model.addAttribute("errorflieds", error);
			return "product";
		}
		productLink.updateProduct(product);
		List<ProductDetails> productList = productLink.getAllproduct();
		logger.info("getting products");
		model.addAttribute("productList", productList);
		return "producttable";

	}

	@GetMapping("/deletepage/{productId}")
	public String deleteproduct(@PathVariable int productId, ModelMap model,  HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		productLink.deleteProduct(productId);
		logger.info("deleted");
		List<ProductDetails> productList = productLink.getAllproduct();
		logger.info("getting products");
		model.addAttribute("productList", productList);
		return "producttable";

	}

	@GetMapping("/Searchpage")
	public String getByProductId(int productId, ModelMap model, HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please reenter your credentials");
			return "productlogin";
		}
		ProductDetails product = productLink.getProductsByProductId(productId);
		logger.info("getting product" + product);
		model.addAttribute("product", product);
		return "SearchByID";

	}

	@GetMapping("/productmenu")
	public String bankToMenu() {
		return "productmenu";

	}

	@GetMapping("/product")
	public String addPage() {
		return "product";

	}
	@ExceptionHandler(value=EmptyResultDataAccessException.class)
	public String errors(Model m) {
		m.addAttribute("msg", "not found");
		return "errorPage";
		
	}
	@ExceptionHandler(value=SQLIntegrityConstraintViolationException.class)
	public String ingtererror(Model m) {
		m.addAttribute("msg", "deleted the second domain  data linked to this product");
		return "errorPage";
		
	}
}
