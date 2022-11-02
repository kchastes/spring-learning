package com.core;


import com.core.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-init.xml");
        User user = applicationContext.getBean("user2", User.class);
        System.out.println(user);
    }

}
