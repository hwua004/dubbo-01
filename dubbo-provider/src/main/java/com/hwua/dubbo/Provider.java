package com.hwua.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args)throws  Exception {
        ClassPathXmlApplicationContext app=
                new ClassPathXmlApplicationContext("provider.xml");
        app.start();

        System.in.read();
    }

}
