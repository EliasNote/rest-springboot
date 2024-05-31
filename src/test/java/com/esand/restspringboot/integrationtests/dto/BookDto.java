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

@XmlRootElement
public class BookDto implements Serializable {

    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
}