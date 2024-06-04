package com.esand.restspringboot.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class FileStorageException extends RuntimeException{
	
	public FileStorageException(String ex) {
		super(ex);
	}
	
	public FileStorageException(String ex, Throwable cause) {
		super(ex, cause);
	}
}