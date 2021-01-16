package com.example.springbootdemo.beanpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean.getClass().equals(TestBean.class)) {
            System.out.println("{MyBeanPostProcessor}-[postProcessBeforeInitialization]");
        }

        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().equals(TestBean.class)) {
            System.out.println("{MyBeanPostProcessor}-[postProcessAfterInitialization]");
        }
        return bean;
    }

}
