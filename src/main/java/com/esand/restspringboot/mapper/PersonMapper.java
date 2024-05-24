package com.esand.restspringboot.mapper;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class PersonMapper {
    private static <O, D> D parseObject(O origin, Class<D> destination) {
        return new ModelMapper().map(origin, destination);
    }

    private static <O, D> List<D> parseObject(List<O> origin, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<D>();
        return new ModelMapper().map(origin, destination);
    }
}
