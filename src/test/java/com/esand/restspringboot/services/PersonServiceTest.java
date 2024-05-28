package com.esand.restspringboot.services;

import com.esand.restspringboot.model.Person;
import com.esand.restspringboot.repositories.PersonRepository;
import com.esand.restspringboot.services.PersonService;
import com.esand.restspringboot.unittests.mapper.MockPerson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    MockPerson input;

    @InjectMocks
    private PersonService service;

    @Mock
    private PersonRepository repository;

    @BeforeEach
    void setUpMocks() {
        input =  new MockPerson();
    }

    @Test
    void create() {
        Person entity = input.mockEntity(1);

        Person persisted = entity;
        persisted.setId(1L);

        when(repository.save(entity)).thenReturn(persisted);

        var result = service.save(entity);
        assertNotNull(result);
        assertNotNull(result.getId());
        assertEquals(1, result.getId());
        assertEquals("First Name Test" + 1, result.getFirstName());
        assertEquals("Last Name Test" + 1, result.getLastName());
        assertEquals("Addres Test" + 1, result.getAddress());
        assertEquals("Female", result.getGender());
    }

    @Test
    void findById() {
        Person entity = input.mockEntity(1);
        entity.setId(1L);

        when(repository.findById(1L)).thenReturn(Optional.of(entity));

        var result = service.findById(1L);
        assertNotNull(result);
        assertNotNull(result.getId());
        assertEquals(1, result.getId());
        assertEquals("First Name Test" + 1, result.getFirstName());
        assertEquals("Last Name Test" + 1, result.getLastName());
        assertEquals("Addres Test" + 1, result.getAddress());
        assertEquals("Female", result.getGender());

    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
}