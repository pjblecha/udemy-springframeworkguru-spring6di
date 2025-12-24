package com.guru.springframework.spring6di.controllers;

import com.guru.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController {

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
