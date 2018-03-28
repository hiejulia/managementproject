package com.hien.project.service;

import com.hien.project.model.data.Person;
import com.hien.project.model.form.PersonForm;

import java.util.List;



public interface PersonServiceInvoker {

    // save person
    public void setPerson(PersonForm person);

    // get person by id
    public Person getPerson(Integer id);

    // get all persons
    public List<Person> getPersons();
}
