package com.example.springbootdemo.beanpostprocessors;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition rootBeanDefinition, Class<?> aClass, String s) {
        if (aClass.equals(TestBean.class)) {
            System.out.println("{MyMergedBeanDefinitionPostProcessor}-[postProcessMergedBeanDefinition]");
        }
    }
}
