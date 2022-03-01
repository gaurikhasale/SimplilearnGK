package com.project.UserDataManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.UserDataManager.exception.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException ex) {
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}
}

