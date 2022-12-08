package com.BikkadIT.PhoneBookWebApplication.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class RestEaceptionHandler 
{
    @ExceptionHandler(value=NoContactFoundException.class)
	public ResponseEntity<ApiResponse> handleNoContactFoundException()
	{
    	ApiResponse apiResponse = new ApiResponse(402,"NoContactFound",new Date());
		
    	return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.BAD_REQUEST);
		
	}
	
}
