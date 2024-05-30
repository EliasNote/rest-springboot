package com.esand.restspringboot.integrationtests.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PersonDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}

