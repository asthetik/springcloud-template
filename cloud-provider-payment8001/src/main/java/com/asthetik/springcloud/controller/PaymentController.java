package com.asthetik.springcloud.controller;

import com.asthetik.springcloud.entity.CommonResult;
import com.asthetik.springcloud.entity.Payment;
import com.asthetik.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(Payment payment) {

        boolean result = paymentService.create(payment);
        log.info("response data: {}", result);

        if (result) {

            return new CommonResult(200, "success", payment.getId());
        }
        return new CommonResult(201, "failure");
    }

    @GetMapping("/get/{id}")
    public CommonResult findById(@PathVariable("id") Long id) {

        Payment payment = paymentService.findById(id);
        if (payment != null) {
            return new CommonResult(200, "success", payment);
        }
        return new CommonResult(201, "failure");
    }
}
