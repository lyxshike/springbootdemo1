package com.example.springbootdemo.beanpostprocessors;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean(initMethod = "init", destroyMethod = "destroys")
    public TestBean run() {
        return new TestBean();
    }
}
