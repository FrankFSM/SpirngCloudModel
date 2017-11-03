package com.ralap.fh.client;

import com.ralap.fh.client.UserClient;
import com.ralap.fh.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ralap
 * @date 2017/11/2
 */
@Component
public class HystrixClientFallback implements UserClient {

    @Override
    public User getUser(@PathVariable("id") long id) {
        User user = new User();
        user.setName("123");
        return user;
    }

}
