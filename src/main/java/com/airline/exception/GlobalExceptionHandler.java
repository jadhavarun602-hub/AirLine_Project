package com.airline.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.airline.entity.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AirlineNotFoundException.class)
	public ResponseEntity<ErrorResponse> AirlineNotFoundExceptionHandler(AirlineNotFoundException anfe,WebRequest webReq)
	{
		
		ErrorResponse errorRes = new ErrorResponse(anfe.getMessage(),
				                                   webReq.getDescription(false),
				                                   "Airline Not Found");
		
		return new ResponseEntity<>(errorRes,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(DuplicateAirlineFoundException.class)
	public ResponseEntity<ErrorResponse> DuplicateAirlineFoundExceptionHandler(DuplicateAirlineFoundException dafe,WebRequest webReq)
	{
		ErrorResponse errorRes = new ErrorResponse(dafe.getMessage(),
				                                   webReq.getDescription(false),
				                                   "Airline is already exist");
		
		return new ResponseEntity<>(errorRes,HttpStatus.CONFLICT);
	}

}
