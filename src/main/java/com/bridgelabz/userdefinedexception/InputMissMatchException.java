package com.bridgelabz.userdefinedexception;

public class InputMissMatchException extends RuntimeException{
	
	String message;
	public InputMissMatchException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
}
