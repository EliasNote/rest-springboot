package com.esand.restspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PersonDto implements Serializable {
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}
