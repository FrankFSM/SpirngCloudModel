package com.ralap.user.service;

import com.ralap.user.domain.User;
import com.ralap.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ralap on 2017/11/2.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(long id) {
        return userMapper.getUserById(id);
    }
}
