package com.educandoweb.course.services.execeptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource nor found. Id " + id);
	}
	
}
