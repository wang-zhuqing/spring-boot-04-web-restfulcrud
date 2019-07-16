package com.wzq.springboot;

import com.wzq.springboot.bean.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot的单元测试，不是junit的
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println("person = " + person);
    }

    @Test
    public void helloService(){
            boolean b = ioc.containsBean("helloService");
        System.out.print(b);
    }
}
