package com.esand.restspringboot.exceptions;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
