package com.guru.springframework.spring6di.controllers;

import com.guru.springframework.spring6di.services.GreetingService;
import com.guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    private final GreetingService greetingService;

    public String sayHello() {
        System.out.println("I am in MyController!");
//        return "Hello from MyController!";
        return greetingService.sayGreeting();
    }
}
