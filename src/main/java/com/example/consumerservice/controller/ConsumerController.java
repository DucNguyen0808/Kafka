package com.example.consumerservice.controller;

import com.example.consumerservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ConsumerController {
    @Autowired
    EmailService emailService;
    @GetMapping(value = "/send")
    public String test() {
//        System.out.println("----------------START SEND-----------");
//        String mes = "Sending message to kafka topic by cafeincode:" + new Random().nextInt(100);
//        producerMessage.sendMessage(mes);
//        System.out.println("----------------END SEND-------------");
        return "OK";
    }
    @GetMapping(value = "/sendEmail")
    public String testEmail() {
       emailService.sendEmail("duc.nguyen01@lifesup.com.vn","test","aaaaaaaaaa");
//        System.out.println("----------------START SEND-----------");
//        String mes = "Sending message to kafka topic by cafeincode:" + new Random().nextInt(100);
//        producerMessage.sendMessage(mes);
//        System.out.println("----------------END SEND-------------");
        return "OK";
    }
}
