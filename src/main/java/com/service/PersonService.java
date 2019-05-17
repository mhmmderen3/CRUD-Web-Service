package com.service;

import com.model.Person;

import java.util.List;

public interface PersonService {
    Person findPerson(int id) throws Exception;//private olacaka

    void createPerson(Person person) throws Exception;

    void updatePerson(Person person) throws Exception;

    void deletePerson(int id) throws Exception;
}
