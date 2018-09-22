package com.amitabh.rest.services.restfulservices.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


//Need to specify which controllers should be using it
@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public CustomizedResponseEntityExceptionHandler() {
        // TODO Auto-generated constructor stub
    }

}
