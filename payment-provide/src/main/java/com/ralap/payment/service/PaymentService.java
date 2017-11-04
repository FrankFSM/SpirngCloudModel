package com.ralap.payment.service;

import com.ralap.payment.domain.Payment;
import com.ralap.payment.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ralap on 2017/11/3.
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    public Payment getPaymentById(long id) {
        return paymentMapper.getPaymentById(id);
    }
}
