package com.ralap.fh.client;

import com.ralap.fh.domain.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ralap on 2017/11/3.
 */
@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {

    Logger logger = LoggerFactory.getLogger(UserFallbackFactory.class);

    @Override
    public UserClient create(Throwable throwable) {
        logger.info(" User getUser(@PathVariable() long id)" + throwable.getMessage());
        return new UserClient() {
            @Override
            public User getUser(@PathVariable("id") long id) {
                User user = new User();
                user.setName("falbackFactory");
                return user;
            }
        };

    }
}
