package com.esand.restspringboot.services;

import com.esand.restspringboot.exceptions.NotFoundException;
import com.esand.restspringboot.model.Person;
import com.esand.restspringboot.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Transactional(readOnly = true)
    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nada achado"));
    }

    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    @Transactional
    public Person update(Long id, Person person) {
        Person result = findById(id);
        result = person;
        result.setId(id);
        return personRepository.save(result);
    }

    @Transactional
    public Person alternEnabled(Long id) {
        Person person = findById(id);
        person.setEnabled(!person.getEnabled());
        return person;
    }
}
