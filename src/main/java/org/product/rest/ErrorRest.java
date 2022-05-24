package org.product.rest;

import java.util.Date;

public class ErrorRest {

	public Date date;
	public String message;

	public Date getDate() {
		return date;
	}

	public ErrorRest(Date date, String message) {
		super();
		this.date = date;
		this.message = message;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "ErrorRest [date=" + date + ", message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
