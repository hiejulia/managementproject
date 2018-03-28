package com.hien.project.dao;


import com.hien.project.model.data.InvoicedProducts;

public interface AccountReceivableDao {

    public InvoicedProducts getInvoicedProduct(Integer id);

}
