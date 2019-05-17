package com.service;

import com.dao.PersonDAO;
import com.dao.PersonDAOImpl;
import com.model.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    PersonDAO personDAO = new PersonDAOImpl();

    public Person findPerson(int id) throws Exception {
        return personDAO.getPersonById(id);
    }

    public void createPerson(Person person) throws Exception {
        personDAO.savePerson(person);
    }

    public void updatePerson(Person person) throws Exception {
        personDAO.updatePerson(person);
    }

    public void deletePerson(int id) throws Exception {
        personDAO.deletePersonById(id);
    }
}
