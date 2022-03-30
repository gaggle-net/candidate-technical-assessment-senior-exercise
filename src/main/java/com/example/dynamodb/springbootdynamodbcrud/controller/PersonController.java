package com.example.dynamodb.springbootdynamodbcrud.controller;

import com.example.dynamodb.springbootdynamodbcrud.entity.Person;
import com.example.dynamodb.springbootdynamodbcrud.model.MovieRole;
import com.example.dynamodb.springbootdynamodbcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return personRepository.findById(id);
    }

    @GetMapping
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping("/search/{searchTerm}")
    public List<Person> findByName(@PathVariable(value = "searchTerm") String searchTerm) {
        // Return all partial matches
        return personRepository.findAll()
            .stream().filter(person -> person.getName().toLowerCase(Locale.ROOT).contains(searchTerm.toLowerCase(Locale.ROOT))).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") String id,
                         @RequestBody Person person) {
        return personRepository.update(id, person);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") String id) {
        return personRepository.delete(id);
    }
}
