package com.example.springbootdemo.service;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

@Validated
public interface TestService {

    String run(@Length(max = 5) String str, @Min(value = 9)  Integer num);

}
