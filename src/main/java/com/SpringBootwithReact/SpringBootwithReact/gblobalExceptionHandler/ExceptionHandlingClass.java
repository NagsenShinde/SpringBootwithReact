package com.SpringBootwithReact.SpringBootwithReact.gblobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionHandlingClass {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseException> getResponse(Exception exception)
	{
		ResponseException responseException = new ResponseException();
		responseException.setMessage("Invalid username and password");
		return new ResponseEntity<>(responseException,HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ResponseException> getResponse(RuntimeException exception)
	{
		ResponseException responseException = new ResponseException();
		responseException.setMessage("Data not available in Db please insert the data");
		return new ResponseEntity<>(responseException,HttpStatus.FORBIDDEN);
	}

}
