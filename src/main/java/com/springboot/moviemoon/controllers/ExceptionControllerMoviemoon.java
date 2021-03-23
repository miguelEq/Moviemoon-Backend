package com.springboot.moviemoon.controllers;

import java.time.format.DateTimeParseException;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerMoviemoon {
	
	 @ExceptionHandler(DateTimeParseException.class)
	 public ResponseEntity<String> handleBadFormatDate(DateTimeParseException exception) {
		 return new ResponseEntity<>("el formato fecha de la fecha es yyyy-mm-dd",HttpStatus.BAD_REQUEST);
	 }
	 @ExceptionHandler(NoSuchElementException.class)
	 public ResponseEntity<String> handleNoSuchElement(NoSuchElementException ex){
		 return new ResponseEntity<>("don't exists element",HttpStatus.NOT_FOUND);
	 }
}
