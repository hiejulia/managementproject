package com.hien.project.service.impl;

import java.util.Date;
import java.util.List;


import com.hien.project.dao.SalesPersonDao;
import com.hien.project.model.data.Person;
import com.hien.project.model.form.PersonForm;
import com.hien.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Hessian Remoting
@Service("/personService.http")
@Transactional
public class PersonServiceImpl implements PersonService {


    // autowird : personDao
    @Autowired
    SalesPersonDao personDao;

    // save person
    @Transactional
    @Override
    public void setPerson(PersonForm person) {
        Person personData = new Person();
        personData.setFirstName(person.getFirstName());
        personData.setMiddleName(person.getMiddleName());
        personData.setLastName(person.getLastName());
        personData.setBirthDate(new Date());
        personData.setMobile(person.getMobile());
        personData.setMobile(person.getMobile());
        personData.setTelephone(person.getTelephone());
        personData.setEmail(person.getEmail());
        personData.setPosition(person.getPosition());
        // personDao. setperson : person Data
        personDao.setPerson(personData);
    }

    // get person by id
    @Override
    public Person getPerson(Integer id) {
        // TODO Auto-generated method stub
        return personDao.getPerson(id);
    }

    // get all persons
    @Override
    public List<Person> getPersons() {
        // TODO Auto-generated method stub
        return personDao.getPersons();
    }

}
