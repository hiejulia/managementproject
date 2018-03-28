package com.hien.project.service;

import com.hien.project.model.data.InvoicedProducts;

import java.util.List;




// Proxy for Spring-WS
public interface AccountReceivableService {

    public InvoicedProducts getInvProduct(Integer id);

    public List<InvoicedProducts> getInvProducts();

    public void setInvoicedProduct(InvoicedProducts invoicedProduct);

}
