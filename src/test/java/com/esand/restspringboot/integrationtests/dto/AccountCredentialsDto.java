package com.esand.restspringboot.integrationtests.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement
public class AccountCredentialsDto implements Serializable {

    private String username;
    private String password;
}
