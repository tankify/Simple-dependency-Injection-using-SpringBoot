package com.telusko.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args); // creates the container for you


        Dev obj = context.getBean(Dev.class);
        // here spring is injecting the Dev dependency
        // NORMAL WORKING Dev obj = new Dev();


        obj.build();



    }

}
