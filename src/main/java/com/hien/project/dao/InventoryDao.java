package com.hien.project.dao;

import com.hien.project.model.data.Catalog;
import com.hien.project.model.data.MaterialType;
import com.hien.project.model.data.Uom;

import java.util.List;



// JAX-WS RPC
public interface InventoryDao {

    public List<Catalog> getProducts();

    public Catalog getProduct(Integer id);

    public void setProduct(Catalog product);

    public List<MaterialType> getMaterialTypes();

    public List<Uom> getUnitMeasure();

}
