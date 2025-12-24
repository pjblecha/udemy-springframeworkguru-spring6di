package com.guru.springframework.spring6di.controllers;

import com.guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    /*
    Once I have @Autowired the controller and loaded the Spring context with the class annotation,
    This becomes superfluous
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        // If this is null, you will get a NPE... comment it out to try
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    */

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}