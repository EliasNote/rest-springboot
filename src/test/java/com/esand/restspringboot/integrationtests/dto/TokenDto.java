package com.esand.restspringboot.integrationtests.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "TokenDto")
public class TokenDto implements Serializable {
    private String username;
    private Boolean authenticated;
    private Date create;
    private Date expiration;
    private String accessToken;
    private String refreshToken;
}
