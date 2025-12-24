package com.guru.springframework.spring6di;

import com.guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

    public static void main(String[] args) {
        ApplicationContext ctxt = SpringApplication.run(Spring6diApplication.class, args);

        MyController ctrlr = ctxt.getBean(MyController.class);

        System.out.println("Hello from Application.Main!");

        System.out.println(ctrlr.sayHello());
    }

}
