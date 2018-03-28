package com.hien.project.service.impl;

import java.util.ArrayList;
import java.util.List;


import com.hien.project.dao.PaymentApDao;
import com.hien.project.model.data.PaymentAp;
import com.hien.project.service.PaymentApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentApServiceImpl implements PaymentApService {

    // PaymentDao
    @Autowired
    private PaymentApDao paymentApDao;

    // get all payment modes
    @Override
    public List<PaymentAp> getAllPaymentModes() {
        // paymentDao.getPaymentAppp
        List<PaymentAp> modes = paymentApDao.getPaymentApp();
        return modes;
    }

}
