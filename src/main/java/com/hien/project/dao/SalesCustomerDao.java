package com.hien.project.dao;

import com.hien.project.model.data.Customer;

import java.util.List;



public interface SalesCustomerDao {

    public void setCustomer(Customer customer);

    public Customer getCustomer(Integer id);

    public List<Customer> getCustomers();


}
