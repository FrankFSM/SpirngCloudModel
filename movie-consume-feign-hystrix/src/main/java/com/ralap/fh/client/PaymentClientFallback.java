package com.ralap.fh.client;

import com.ralap.fh.domain.Payment;
import com.ralap.fh.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ralap on 2017/11/3.
 */
@Component
public class PaymentClientFallback implements PaymentClient {


    @Override
    public Payment getPayment(@PathVariable long id) {
        Payment payment = new Payment();
        payment.setId(-1);
        payment.setManay(-1);
        payment.setUserId(-1);
        return payment;
    }
}
