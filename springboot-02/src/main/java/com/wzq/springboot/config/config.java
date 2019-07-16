package com.wzq.springboot.config;

import com.wzq.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//次注解表示这个类是一个配置类
@Configuration
public class config {

    @Bean
    public HelloService helloService(){
        System.out.print("给springboot添加配置类");
        return new HelloService();
    }
}
