package com.hien.project.dao;

import com.hien.project.model.data.Person;

import java.util.List;



public interface SalesPersonDao {

    public void setPerson(Person person);

    public Person getPerson(Integer id);

    public List<Person> getPersons();

}
