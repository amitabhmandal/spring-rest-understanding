package com.amitabh.rest.services.restfulservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//types annotated with RestController have default semantics for RequestMapping and ResponseBody
public class HelloWorld {
    
    //GET - method 
    //URI - /hello-world 
    
    @RequestMapping(method=RequestMethod.GET, path = "/morning-hello-world")
    public String goodMorningHelloWorld() {
        return "good morning hello world";
    }

    @GetMapping(path = "/night-hello-world")
    public String goodNightHelloWorld() {
        return "good night hello world";
    }
    
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
    
    @GetMapping(path = "/hello-world-bean/{name}")
    //Annotation which indicates that a method parameter should be bound to a URI template
    //If the method parameter is Map<String, String> then all  
    //the map is populated with all path variable names and values.
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(name);
    }
}
