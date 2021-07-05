package com.azure.javamongo.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class MessageController {

    @GetMapping("get/message")
    public String showMessage(){
        return "Application is deployed to azure server successfully!!";
    }
}
