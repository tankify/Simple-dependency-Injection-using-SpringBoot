package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// XML based config or annotation-based (@Components -> auto-injection) or java based config (@bean / @Config) or Auto-Configuration (in Spring boot)
// this class is a component implies spring understand that this class needs to be managed by spring
@Component
public class Dev {

    // Laptop laptop = new Laptop(); // normal way
    // Field Injection
    // Here Autowired uses 'by Type' to resolve dependency

    // In case of Interface either have Component annotation on only one implementing class
    // so that dependency can be resolved
    // or in this case of confusion you can use Primary annotation with Component annotation in Laptop class,
    // or you can use Qualifier and mention the class name without capital letter (there can also be other ways!)
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

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
        comp.compile();
        System.out.println("working on Awesome Project");
    }

}
