package com.github.nalha.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestApi {

    @GetMapping("hello")
    public String hello() {
        return "hello there pals";
    }

}
