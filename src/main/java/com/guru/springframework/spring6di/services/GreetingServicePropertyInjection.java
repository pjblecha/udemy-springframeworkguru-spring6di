package com.guru.springframework.spring6di.services;


import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends Don't Let Friends Do Property Injection!";
    }
}
