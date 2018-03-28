package com.hien.project.service.impl;

import com.hien.project.dao.InventoryDao;
import com.hien.project.model.data.Catalog;
import com.hien.project.model.data.MaterialType;
import com.hien.project.model.data.Uom;
import com.hien.project.model.form.InventoryForm;
import com.hien.project.service.InvoiceAddProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceAddProductImpl implements InvoiceAddProduct {

    @Autowired
    private InventoryDao inventoryDao;


    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT
    )
    @Override
    public void addProduct(InventoryForm invForm) {
        Catalog catalog = new Catalog();
        catalog.setName(invForm.getName());
        catalog.setDescription(invForm.getDescription());
        catalog.setCostPrice(invForm.getCostPrice());
        catalog.setRetailPrice(invForm.getRetailPrice());
        catalog.setWholesalePrice(invForm.getWholeSalePrice());
        catalog.setStock(invForm.getStock());
        catalog.setTags(invForm.getTags());
        catalog.setSupplierId(invForm.getVendor());

        Uom uom = new Uom();
        uom.setId(invForm.getUomId());

        MaterialType type = new MaterialType();
        type.setId(invForm.getTypeId());

        catalog.setUom(uom);
        catalog.setMaterialType(type);

        inventoryDao.setProduct(catalog);

    }

}
