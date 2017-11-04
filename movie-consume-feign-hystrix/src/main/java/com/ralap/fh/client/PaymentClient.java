package com.ralap.fh.client;

import com.ralap.config.PaymentConfig;
import com.ralap.fh.domain.Payment;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ralap on 2017/11/3.
 */
@FeignClient(name = "payment-provide", configuration = PaymentConfig.class, fallback = PaymentClientFallback.class)
public interface PaymentClient {

    @RequestMapping(value = "/getPayment/{id}", method = RequestMethod.GET)
    public Payment getPayment(@PathVariable("id") long id);
}
