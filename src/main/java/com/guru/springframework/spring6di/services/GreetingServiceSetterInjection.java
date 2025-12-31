package com.guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Oh, Sure, Let's Just Setter Inject Now....";
    }
}
