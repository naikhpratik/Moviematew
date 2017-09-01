package io.springMVC.exception;

public class UserAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = -325516995063089397L;

	public UserAlreadyExistsException(String message) {
		super(message);
	}
	
	public UserAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}
}
