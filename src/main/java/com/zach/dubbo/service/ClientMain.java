package com.zach.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2016-10-16.
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        //因为这个spring是dubbo自带的，所以在这里就直接使用就好了，不用在引入spring了
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dubbo-consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        String response = helloService.sayHello("hello");
        System.out.println(response);
    }
}
