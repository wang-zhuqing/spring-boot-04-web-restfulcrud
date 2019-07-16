package com.wzq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(name = "hello" )
    public String helloWorld(){
        return "唉！又开始了！";
    }
}
