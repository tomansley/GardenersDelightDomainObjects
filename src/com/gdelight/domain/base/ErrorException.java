package com.gdelight.domain.base;

public class ErrorException extends Exception {

	private static final long serialVersionUID = 1L;

	public ErrorException(String message) {
		super(message);
	}
	
	public ErrorException(Throwable exception, String message) {
		super(message, exception);
	}
	
}
