package com.example.springbootdemo;

import com.example.springbootdemo.service.TestService;
import com.example.springbootdemo.vo.Person;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;


@RestController
@RequestMapping("/demo/")
@SpringBootApplication
@Validated
public class SpringbootdemoApplication {

    @Autowired
    public TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    @GetMapping(value = "shike/{str}/{num}")
    public Integer test(@PathVariable("str") @Length(max = 5) String str, @PathVariable("num") @Min(value = 9) Integer num) {
        System.out.println(testService.getClass());
        //testService.run(str, num);
        return num;
    }



    @PostMapping(value = "shite")
    public Integer shite(@RequestBody @Valid Person person) {

        System.out.println(person.getAge());
        System.out.println(person.getName());
        return person.getAge();
    }

}
