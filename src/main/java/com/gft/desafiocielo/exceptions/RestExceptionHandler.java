package com.gft.desafiocielo.exceptions;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { JsonParseException.class, JsonMappingException.class, IOException.class })
	protected ResponseEntity<Object> exception(JsonParseException jpe, JsonMappingException jme, IOException ioe) {
		String error = "Service error. Please contact the support team.";
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
