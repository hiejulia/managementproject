package com.hien.project.service;


import com.hien.project.model.data.Supplier;

import java.util.List;

import javax.jws.WebService;


@WebService
public interface SalesInventoryService {

    // get all suppliers
    public List<Supplier> getAllSuppliers();

    // get contact infor by id
    public Contact getContactInfo(Integer id);

}
