package com.bridgelabz.userregjunit;

import com.bridgelabz.userregjunit.UserValidatorException.ExceptionType;

@SuppressWarnings({ "unused", "serial" })
public class UserValidatorException extends RuntimeException{
	
	enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY,
        
    }
    ExceptionType type;
	public UserValidatorException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}