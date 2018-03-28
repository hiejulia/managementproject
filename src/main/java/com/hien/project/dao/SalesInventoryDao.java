package com.hien.project.dao;

import com.hien.project.model.data.Contact;
import com.hien.project.model.data.Supplier;

import java.util.List;



public interface SalesInventoryDao {

    // get suppliers
    public List<Supplier> getSuppliers();

    // get contact
    public Contact getContact(Integer id);

}
