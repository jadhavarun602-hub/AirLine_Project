package com.airline.entity;

import java.time.LocalDateTime;

public class ErrorResponse {

	private LocalDateTime timeStamp;
	private String errorMsg;
	private String errorDetails;
	private String errorCode;

	public ErrorResponse(String errorMsg, String errorDetails, String errorCode) {
		this.timeStamp = LocalDateTime.now();
		this.errorMsg = errorMsg;
		this.errorDetails = errorDetails;
		this.errorCode = errorCode;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public String getErrorCode() {
		return errorCode;
	}

}