package com.ralap.zuul.filter;

import com.netflix.ribbon.proxy.annotation.Http;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by ralap on 2017/11/5.
 */
@Component
public class MyFilter extends ZuulFilter {

    public static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest reques = RequestContext.getCurrentContext().getRequest();
        String host = reques.getRemoteHost();
        MyFilter.logger.info("请求的host：" + host);
        return null;
    }
}
