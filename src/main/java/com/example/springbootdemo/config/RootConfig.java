package com.example.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class RootConfig {

    @Bean
    @Order(1)
    public MethodValidationPostProcessor getBean() {
        return new MethodValidationPostProcessor();
    }

//    @Bean
//    public BeanValidationPostProcessor getBean2() {
//        return new BeanValidationPostProcessor();
//    }
}
