package com.amitabh.rest.services.restfulservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
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
}
