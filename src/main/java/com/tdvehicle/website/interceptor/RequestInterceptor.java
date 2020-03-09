package com.tdvehicle.website.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


@Component("interceptor")
@Slf4j(topic = "interceptor")
public class RequestInterceptor extends HandlerInterceptorAdapter {

}

