package com.hien.project.service;

import com.hien.project.model.data.Customer;
import com.hien.project.model.form.CustomerForm;

import java.util.List;



public interface CustomerService {

    // save new customer
    public void setCustomer(CustomerForm customer);

    // get customer
    public Customer getCustomer(Integer id);

    // list all customers
    public List<Customer> getCustomers();


}
