package com.esand.restspringboot.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
