package com.hien.project.service.impl;

import java.util.List;

import com.hien.project.dao.SalesSupplierDao;
import com.hien.project.model.data.Supplier;
import com.hien.project.model.form.SupplierForm;
import com.hien.project.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Burlap Remoting
@Service("/supplierService.http")
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SalesSupplierDao supplierDao;


    // save new supplier
    @Override
    public void setSupplier(SupplierForm supplier) {
        Supplier supplierData = new Supplier();
        supplierData.setName(supplier.getName());
        supplierData.setStreet(supplier.getStreet());
        supplierData.setCity(supplier.getCity());
        supplierData.setCountry(supplier.getCountry());
        supplierData.setZip(supplier.getZip());
        supplierData.setFax(supplier.getFax());
        supplierData.setTelephone(supplier.getTelephone());
        supplierData.setEmail(supplier.getEmail());
        supplierDao.setSupplier(supplierData);

    }

    // get supplier by id
    @Override
    public Supplier getSupplier(Integer id) {
        // TODO Auto-generated method stub
        return supplierDao.getSupplier(id);
    }

    // get list of suppliers
    @Override
    public List<Supplier> getSuppliers() {
        // TODO Auto-generated method stub
        return supplierDao.getSuppliers();
    }

}
