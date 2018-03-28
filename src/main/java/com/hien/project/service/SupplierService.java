package com.hien.project.service;

import com.hien.project.model.data.Supplier;
import com.hien.project.model.form.SupplierForm;

import java.util.List;



public interface SupplierService {

    public void setSupplier(SupplierForm supplier);

    public Supplier getSupplier(Integer id);

    public List<Supplier> getSuppliers();

}
