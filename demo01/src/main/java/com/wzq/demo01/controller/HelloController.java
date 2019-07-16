package com.wzq.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody 注解写在类上面意味着这个类的方法都被ResponseBody修饰了
这两个注解可以用下面一个注解替换
*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.print("测试springboot");
        return "hello world";
    }
}
