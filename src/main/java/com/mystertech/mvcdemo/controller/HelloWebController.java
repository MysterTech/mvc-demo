package com.mystertech.mvcdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
    @RequestMapping("/")
    public String sayHelloWeb() {
        Logger logger = LoggerFactory.getLogger("helloweb");
        logger.info("request recieved");
        return "Hello World!";
    }
}
