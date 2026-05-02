package com.airline.exception;

public class DuplicateAirlineFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DuplicateAirlineFoundException(String message) {
		super(message);
	}
	
	

}
