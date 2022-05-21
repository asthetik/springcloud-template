package com.asthetik.springcloud.service.impl;

import com.asthetik.springcloud.dao.PaymentDao;
import com.asthetik.springcloud.entity.Payment;
import com.asthetik.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public boolean create(Payment payment) {

        return paymentDao.create(payment);
    }

    public Payment findById(Long id) {

        return paymentDao.findById(id);
    }
}
