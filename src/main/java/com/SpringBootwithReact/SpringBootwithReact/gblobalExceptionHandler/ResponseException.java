package com.SpringBootwithReact.SpringBootwithReact.gblobalExceptionHandler;

import org.springframework.http.HttpStatus;

public class ResponseException extends RuntimeException {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
 
	
}
