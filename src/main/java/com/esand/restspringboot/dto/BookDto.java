package com.esand.restspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookDto extends RepresentationModel<BookDto> implements Serializable {
    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
}