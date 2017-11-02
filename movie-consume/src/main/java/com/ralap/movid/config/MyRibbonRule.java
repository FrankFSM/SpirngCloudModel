package com.ralap.movid.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ralap on 2017/11/2.
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
