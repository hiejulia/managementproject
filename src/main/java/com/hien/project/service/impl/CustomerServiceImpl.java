package com.hien.project.service.impl;


import java.util.List;


import com.hien.project.dao.SalesCustomerDao;
import com.hien.project.model.data.Customer;
import com.hien.project.model.form.CustomerForm;
import com.hien.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// HTTP Invoker Implementation

@Service("/customerService.http")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    // autowired : salesCustomerDao
    @Autowired
    SalesCustomerDao customerDao;

    // create new customer
    @Transactional
    @Override
    public void setCustomer(CustomerForm customer) {
        Customer customerData = new Customer();
        customerData.setName(customer.getName());
        customerData.setStreet(customer.getStreet());
        customerData.setCity(customer.getCity());
        customerData.setCountry(customer.getCountry());
        customerData.setZip(customer.getZip());
        customerData.setFax(customer.getFax());
        customerData.setTelephone(customer.getTelephone());
        // save to the database
        customerDao.setCustomer(customerData);
    }

    @Override
    public Customer getCustomer(Integer id) {
        // TODO Auto-generated method stub
        return customerDao.getCustomer(id);
    }

    // get all list of customers
    @Override
    public List<Customer> getCustomers() {
        // TODO Auto-generated method stub
        // customerDao. getAllCustomers
        return customerDao.getCustomers();
    }

}
