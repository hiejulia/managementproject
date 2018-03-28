package com.hien.project.service.impl;


import java.util.ArrayList;
import java.util.List;


import com.hien.project.dao.AccountReceivableDao;
import com.hien.project.model.data.Invoice;
import com.hien.project.model.data.InvoicedProducts;
import com.hien.project.model.data.PaymentAp;
import com.hien.project.service.AccountReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Spring WS Implementation
@Service
@Transactional
public class AccountReceivableServiceImpl implements AccountReceivableService {

    // account receivable dao : autowired

    @Autowired
    AccountReceivableDao accountReceivableDao;

    // get invoice product by id
    @Override
    public InvoicedProducts getInvProduct(Integer id) {

        InvoicedProducts invProdWS = new InvoicedProducts();
        Invoice invWS = new Invoice();
        PaymentAp paymentWS = new PaymentAp();

        invProdWS.setId(accountReceivableDao.getInvoicedProduct(id).getId());
        invProdWS.setCatId(accountReceivableDao.getInvoicedProduct(id).getCatId());
        invProdWS.setInvId(accountReceivableDao.getInvoicedProduct(id).getInvId());
        invWS.setId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getId());
        invWS.setCatId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getCatId());
        invWS.setCustId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getCustId());
        paymentWS.setId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getPaymentAp().getId());
        paymentWS.setTerm(accountReceivableDao.getInvoicedProduct(id).getInvoice().getPaymentAp().getTerm());
        invWS.setDate(null);
        invWS.setPaymentAp(paymentWS);
        invProdWS.setInvoice(invWS);
        return invProdWS;
    }

    @Override
    public List<InvoicedProducts> getInvProducts() {
        List<InvoicedProducts> lists = new ArrayList<>();
        return lists;
    }

    @Override
    public void setInvoicedProduct(InvoicedProducts invoicedProduct) {
        // TODO Auto-generated method stub

    }

}
