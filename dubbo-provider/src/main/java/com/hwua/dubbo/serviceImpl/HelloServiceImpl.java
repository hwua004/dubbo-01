package com.hwua.dubbo.serviceImpl;

import com.hwua.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("服务被调用了");
        return "Hello , "+name;
    }
}
