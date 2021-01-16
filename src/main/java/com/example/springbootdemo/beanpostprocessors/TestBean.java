package com.example.springbootdemo.beanpostprocessors;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements InitializingBean, DisposableBean {

    public TestBean() {
        System.out.println("TestBean 构造方法执行");
    }

    private static String s = makeProerty();

    public static String makeProerty() {
        System.out.println("TestBean 属性赋值");
        return "";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy 方法执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet 方法执行");
    }

    public void init() {
        System.out.println("init 方法执行");
    }

    public void destroys() {
        System.out.println("destroys 方法执行");
    }
}
