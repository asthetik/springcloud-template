package com.asthetik.springcloud.service;

import com.asthetik.springcloud.entity.Payment;

public interface PaymentService {

    boolean create(Payment payment);

    Payment findById(Long id);
}
