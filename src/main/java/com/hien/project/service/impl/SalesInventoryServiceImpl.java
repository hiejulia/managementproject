package com.hien.project.service.impl;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hien.project.dao.SalesInventoryDao;
import com.hien.project.model.data.Contact;
import com.hien.project.model.data.Supplier;
import com.hien.project.service.SalesInventoryService;
import org.springframework.beans.factory.annotation.Autowired;

// web service
@WebService
public class SalesInventoryServiceImpl implements SalesInventoryService {

    @Autowired
    SalesInventoryDao salesDao;

    // get all suplliers : salesDao.getSuppliers ()
    @WebMethod(operationName="getAllSuppliers")
    @Override
    public List<Supplier> getAllSuppliers() {

        return salesDao.getSuppliers();
    }

    // get contact infor by id
    @WebMethod(operationName="getContactInfo")
    @Override
    public Contact getContactInfo(Integer id) {
        // TODO Auto-generated method stub
        // salesDao.get contact by id
        return salesDao.getContact(id);
    }
}
