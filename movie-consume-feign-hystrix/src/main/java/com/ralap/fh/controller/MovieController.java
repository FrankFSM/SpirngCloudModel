package com.ralap.fh.controller;

import com.ralap.fh.client.PaymentClient;
import com.ralap.fh.client.UserClient;
import com.ralap.fh.domain.Payment;
import com.ralap.fh.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralap on 2017/11/2.
 */
@RestController
public class MovieController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private PaymentClient paymentClient;

    @GetMapping("/movie/{id}")
//    @HystrixCommand(fallbackMethod = "getDefaultMovide")
    public User getMovide(@PathVariable long id) {
        return userClient.getUser(id);
    }

    @GetMapping("/getPayment/{id}")
    public Payment allMovie(@PathVariable long id) {
        return paymentClient.getPayment(id);
    }

//    public User getDefaultMovide(long id) {
//        User user = new User();
//        user.setId(-1L);
//        user.setName("失败");
//        user.setAge(-1);
//        user.setAddress("未知");
//        return user;
//    }
}
