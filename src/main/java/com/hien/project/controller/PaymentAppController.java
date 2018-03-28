package com.hien.project.controller;

import java.util.List;


import com.hien.project.model.data.PaymentAp;
import com.hien.project.service.PaymentApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// rest controller
@RestController
public class PaymentAppController {


    // payment ap service : show payment ap json : service.getAllPaymentModes()
    @Autowired
    private PaymentApService paymentApService;

    @RequestMapping(value="/erp/paymentmodes.json")
    public List<PaymentAp> showPaymentApJson(){
        return paymentApService.getAllPaymentModes();
    }


    @RequestMapping(value="/erp/paymentmodes.xml")
    public ListPaymentAp showPaymentApXml(){
        ListPaymentAp listPayment = new ListPaymentAp();
        listPayment.setListPaymentAp(paymentApService.getAllPaymentModes());
        return listPayment;
    }



}
