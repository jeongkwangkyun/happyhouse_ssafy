package com.ssafy.happyhouse.exception;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<String> noHandlerFoundException(NoHandlerFoundException exception){
		return new ResponseEntity<String>(FAIL, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UnAuthorizedException.class)
	public ResponseEntity<String> UnAuthorizedException(UnAuthorizedException exception){
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String> sqlValidException(SQLException exception){
		return new ResponseEntity<String>(FAIL, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(UserNameException.class)
	public ResponseEntity<String> userNameException(UserNameException exception){
		return new ResponseEntity<String>(FAIL, HttpStatus.BAD_REQUEST);
	}
}
