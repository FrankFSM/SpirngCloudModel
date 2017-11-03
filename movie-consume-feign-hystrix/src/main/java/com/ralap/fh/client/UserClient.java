package com.ralap.fh.client;

import com.ralap.fh.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ralap on 2017/11/2.
 */
@FeignClient(name = "user-provider", fallback = HystrixClientFallback.class)
public interface UserClient {

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") long id);

}



