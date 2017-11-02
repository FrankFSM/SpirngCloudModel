package com.ralap.user.controller;

import com.netflix.discovery.converters.Auto;
import com.ralap.user.domain.User;
import com.ralap.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralap on 2017/11/2.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }
}
