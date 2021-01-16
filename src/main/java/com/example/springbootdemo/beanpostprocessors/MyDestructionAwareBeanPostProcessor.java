package com.example.springbootdemo.beanpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object o, String s) throws BeansException {
        if (o.getClass().equals(TestBean.class)) {
            System.out.println("{MyDestructionAwareBeanPostProcessor}-[postProcessBeforeDestruction]");
        }
    }
}
