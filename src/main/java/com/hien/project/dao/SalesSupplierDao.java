package com.hien.project.dao;


import com.hien.project.model.data.Supplier;

import java.util.List;



public interface SalesSupplierDao {

    // set supplier
    public void setSupplier(Supplier supplier);

    public Supplier getSupplier(Integer id);

    public List<Supplier> getSuppliers();

}
