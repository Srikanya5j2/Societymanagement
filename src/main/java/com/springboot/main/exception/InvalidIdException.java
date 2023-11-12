package com.springboot.main.exception;

public class InvalidIdException extends Exception{
	private static final long serialVersionUID = -7611874505314550904L;

	private String message;

	public InvalidIdException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	} 
}