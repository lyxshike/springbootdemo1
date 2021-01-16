package com.example.springbootdemo.beanpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.equals(TestBean.class)) {
            System.out.println("{MyInstantiationAwareBeanPostProcessor}-[postProcessBeforeInstantiation]");
        }
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        if (bean.getClass().equals(TestBean.class)) {
            System.out.println("{MyInstantiationAwareBeanPostProcessor}-[postProcessAfterInstantiation]");
        }
        return true;
    }


    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (bean.getClass().equals(TestBean.class)) {
            System.out.println("{MyInstantiationAwareBeanPostProcessor}-[postProcessProperties]");
        }

        return null;
    }
}
