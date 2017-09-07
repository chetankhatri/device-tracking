package com.myboiler.heating.product.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.validation.ObjectError;
@ControllerAdvice
public class ExceptionHandlingController {
	 @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<ExceptionResponse> resourceNotFound(ResourceNotFoundException ex) {
	        ExceptionResponse response = new ExceptionResponse();
	        response.setErrorCode("Not Found");
	        response.setErrorMessage(ex.getMessage());

	        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<ExceptionResponse> invalidInput(MethodArgumentNotValidException ex) {
	        BindingResult result = ex.getBindingResult();
	        ExceptionResponse response = new ExceptionResponse();
	        response.setErrorCode("Validation Error");
	        response.setErrorMessage("Invalid inputs.");
	        response.setErrors(fromBindingErrors(result));

	        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
	    }
	    public static List<String> fromBindingErrors(Errors errors) {
	        List<String> validErrors = new ArrayList<String>();
	        for (ObjectError objectError : errors.getAllErrors()) {
	            validErrors.add(objectError.getDefaultMessage());
	        }
	        return validErrors;
	    }
}
