package com.hien.project.service;

import com.hien.project.model.data.Catalog;
import com.hien.project.model.data.MaterialType;
import com.hien.project.model.data.Uom;
import com.hien.project.model.form.InventoryForm;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.ws.Action;


// Proxy for Jax-WS RPC
@WebService(name = "InventoryService")
@SOAPBinding( style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface InventoryService {

    // get products
    @WebMethod(operationName="getProducts")
    public Catalog[] getProducts();

    // get product by id
    @WebMethod(operationName="getProduct")
    public Catalog getProduct(Integer id);

    // add new product
    @WebMethod(operationName="addProduct")
    public int addProduct(InventoryForm invForm);

    // get material types
    @WebMethod(operationName="getMaterialTypes")
    public MaterialType[] getMaterialTypes();

    // get unit measure
    @WebMethod(operationName="getUnitMeasure")
    public Uom[] getUnitMeasure();

}
