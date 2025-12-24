package com.guru.springframework.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From The Greeting Service Implementation!";
    }
}
