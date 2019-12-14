package com.prodapt.app.exception;

import java.util.Date;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.prodapt.app.model.dto.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	 @ExceptionHandler(NoteNotFoundException.class)
	 public final ResponseEntity<ApiResponse> handleNoteNotFoundException(NoteNotFoundException ex, WebRequest request) {		 
		 ApiResponse apiErrorResponse = new ApiResponse(ex.getMessage(),new Date(),HttpStatus.NOT_FOUND);
		 return new ResponseEntity<>(apiErrorResponse, HttpStatus.NOT_FOUND);
	 }
	 
	 @ExceptionHandler(EmptyResultDataAccessException.class)
	 public final ResponseEntity<ApiResponse> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex, WebRequest request) {		 
		 ApiResponse apiErrorResponse = new ApiResponse(ex.getMessage(),new Date(),HttpStatus.NOT_FOUND);
		 return new ResponseEntity<>(apiErrorResponse, HttpStatus.NOT_FOUND);
	 }
	 
	 @ExceptionHandler(HttpMessageNotReadableException.class)
	 public final ResponseEntity<ApiResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request) {		 
		 ApiResponse apiErrorResponse = new ApiResponse(ex.getMessage(),new Date(),HttpStatus.BAD_REQUEST);
		 return new ResponseEntity<>(apiErrorResponse, HttpStatus.BAD_REQUEST);
	 }
	 
	 @ExceptionHandler(Exception.class)
	  public final ResponseEntity<ApiResponse> handleAllExceptions(Exception ex, WebRequest request) {		  
		 ApiResponse apiErrorResponse = new ApiResponse(ex.getMessage(),new Date(),HttpStatus.INTERNAL_SERVER_ERROR);
    	return new ResponseEntity<>(apiErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	  }

}
