package io.springMVC.exception;

public class UserNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = -325516995063089397L;

	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
