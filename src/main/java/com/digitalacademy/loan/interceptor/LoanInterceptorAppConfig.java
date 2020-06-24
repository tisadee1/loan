package com.digitalacademy.loan.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class LoanInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    LoanInterceptor loanInterceptor;

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loanInterceptor);
    }
}
