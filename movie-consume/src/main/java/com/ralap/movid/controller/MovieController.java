package com.ralap.movid.controller;

import com.ralap.movid.client.UserClient;
import com.ralap.movid.domain.User;
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

    @GetMapping("/movie/{id}")
    public User getMovide(@PathVariable long id) {
        return userClient.getUser(id);
    }
}
