package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String run(String str, Integer num) {
        return null;
    }
}
