package org.product.rest;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ErrorException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ErrorRest> handler(SQLIntegrityConstraintViolationException exception, WebRequest request) {
		ErrorRest error = new ErrorRest(new Date(), exception.getMessage());

		return new ResponseEntity<ErrorRest>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<ErrorRest> handler(EmptyResultDataAccessException exceptions, WebRequest request) {
		ErrorRest error = new ErrorRest(new Date(), exceptions.getMessage());

		return new ResponseEntity<ErrorRest>(error, HttpStatus.NOT_FOUND);

	}
}
