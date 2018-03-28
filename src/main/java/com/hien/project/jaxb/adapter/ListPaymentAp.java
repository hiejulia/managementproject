package com.hien.project.jaxb.adapter;


import com.hien.project.model.data.PaymentAp;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="paymentmodes")
public class ListPaymentAp {

    private List<PaymentAp> listPaymentAp;

    public List<PaymentAp> getListPaymentAp() {
        return listPaymentAp;
    }

    public void setListPaymentAp(List<PaymentAp> listPaymentAp) {
        this.listPaymentAp = listPaymentAp;
    }



}
