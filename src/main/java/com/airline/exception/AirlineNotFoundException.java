package com.airline.exception;

public class AirlineNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public AirlineNotFoundException(String message) {
		super(message);
		
	}
	
	

}
