package com.ralap.payment.controller;

import com.ralap.payment.domain.Payment;
import com.ralap.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralap on 2017/11/3.
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getPayment/{id}")
    public Payment getPaymentById(@PathVariable long id) {
        return paymentService.getPaymentById(id);
    }
}
