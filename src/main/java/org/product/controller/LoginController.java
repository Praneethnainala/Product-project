package org.product.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class LoginController {

	@GetMapping("/")
	public String index() {
		return "productlogin";
	}

	@PostMapping("/LoginPage")
	public String menu(ModelMap model, @RequestParam String username, String password, HttpSession session) {

		if (username.equals("praneeth") && password.equals("1234")) {
			session.setAttribute("username", username);
			model.addAttribute(username, "username");
			return "productmenu";
		} else {
			model.put("error", "Invalid username and password");
			return "productlogin";
		}
	}

	@GetMapping("/Logout")
	public String logout() {
		return "productlogin";

	}
}
