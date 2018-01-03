package com.ralap.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ralap
 * @date: created at 2017/12/28 10:10
 */

@RestController
public class DemoController {

    @Value("${from}")
    private String from;

    @RequestMapping("/hello")
    public String hello() {
        return from;
    }
}
