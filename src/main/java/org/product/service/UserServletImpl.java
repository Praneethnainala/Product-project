package org.product.service;

public class UserServletImpl implements UserServlet {


	public boolean isValid(String username, String password) {
		// Todo implement valid logic
		if (username.equals("praneeth") && password.equals("manuh@123")) {
			return true;
		}
		return false;
	}

}

