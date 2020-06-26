package com.bridgelabz.userdefinedexception;

public class CustomisedException extends RuntimeException {
	String message;
	public CustomisedException(String message) {
		super(message);
	}
}
