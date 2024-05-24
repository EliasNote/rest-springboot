package com.esand.restspringboot.controllers;

import com.esand.restspringboot.mapper.PersonMapper;
import com.esand.restspringboot.model.Person;
import com.esand.restspringboot.services.PersonService;
import dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDto> create(@RequestBody PersonDto dto) {
        Person person = personService.save(PersonMapper.parseObject(dto, Person.class));
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonMapper.parseObject(person, PersonDto.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(PersonMapper.parseObject(personService.findById(id), PersonDto.class));
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> findAll() {
        return ResponseEntity.ok(PersonMapper.parseListObject(personService.findAll(), PersonDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        personService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonDto> update(@PathVariable Long id, @RequestBody PersonDto dto) {
        Person person = personService.update(id, PersonMapper.parseObject(dto, Person.class));
        return ResponseEntity.ok(PersonMapper.parseObject(person, PersonDto.class));
    }
}
