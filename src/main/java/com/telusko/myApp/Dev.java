package com.telusko.myApp;

import org.springframework.stereotype.Component;


// XML based config or annotation-based (@Components -> auto-injection) or java based config (@bean / @Config) or Auto-Configuration (in Spring boot)
// this class is a component implies spring understand that this class needs to be managed by spring
@Component
public class Dev {

    public void build(){
        System.out.println("working on Awesome Project");
    }

}
