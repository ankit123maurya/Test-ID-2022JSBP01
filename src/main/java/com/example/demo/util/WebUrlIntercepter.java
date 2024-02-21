package com.example.demo.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

public class WebUrlIntercepter extends WebRequestHandlerInterceptorAdapter {
    public WebUrlIntercepter(WebRequestInterceptor requestInterceptor) {
        super(requestInterceptor);
    }

    public boolean perHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        if(request.getMethod().equalsIgnoreCase("POST")){
            String requestBody=request.getRequestURI();
        }
        return true;
    }
}
