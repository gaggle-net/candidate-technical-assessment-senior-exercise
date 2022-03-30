package com.example.dynamodb.springbootdynamodbcrud;

import static org.assertj.core.api.Assertions.assertThat;
import com.example.dynamodb.springbootdynamodbcrud.controller.PersonController;
import com.example.dynamodb.springbootdynamodbcrud.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonControllerTests {

    private static String testId = "c812f550-8bc2-4a4c-af6a-d3b47e3899c4";

    @Autowired
    private PersonController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void save() throws Exception {
        Person person = new Person();
        person.setName("Test Person");

        Person result = controller.save(person);

        assertThat(result).isNotNull();

        // Clean up
        controller.delete(result.getId());
    }

    @Test
    public void findById() throws Exception {
        Person person = controller.findById(testId);

        assertThat(person.getName()).isEqualTo("Troy McClure");
    }

    @Test
    public void findAll() throws Exception {
        List<Person> persons = controller.findAll();

        assertThat(persons.size()).isGreaterThan(1);
    }

    @Test
    public void findByName() throws Exception {
        List<Person> matches = controller.findByName("ca");

        assertThat(matches.size()).isGreaterThan(1);
    }

    @Test
    public void update() throws Exception {
        Person existing = controller.findById(testId);
        String temp = existing.getName();
        existing.setName("Updated Name");

        String result = controller.update(testId,
                existing);

        assertThat(result).isEqualTo(testId);

        // Clean up
        existing.setName(temp);
        controller.update(testId, existing);
    }

    @Test
    public void delete() throws Exception {
        // We need someone to delete
        Person newPerson = new Person();
        newPerson.setName("Marvin the paranoid android");

        Person result = controller.save(newPerson);

        String status = controller.delete(result.getId());

        assertThat(status).contains("success");
    }

}
