package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// XML based config or annotation-based (@Components -> auto-injection) or java based config (@bean / @Config) or Auto-Configuration (in Spring boot)
// this class is a component implies spring understand that this class needs to be managed by spring
@Component
public class Dev {

    // Laptop laptop = new Laptop(); // normal way
    // Field Injection
    @Autowired
    private Laptop laptop;

    // Constructor Injection
    //    public Dev(Laptop laptop){
    //        this.laptop = laptop;
    //    }

    // Setter Injection
    //    @Autowired
    //    public void setLaptop(Laptop laptop){
    //        this.laptop = laptop;
    //    }

    // for field and setter injection Autowired is required however for constructor injection
    // it is not required
    // constructor and setter are better but field is not why?

    public void build(){
        laptop.compile();
        System.out.println("working on Awesome Project");
    }

}
