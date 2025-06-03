package com.example.Kafkalogflow.controller;

import com.example.Kafkalogflow.service.LogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LogController {

    @Autowired
    private LogProducer logProducer;
    @PostMapping("/logs")
    public void logs(@RequestBody String log){
        logProducer.sendMessage(log);

    }

    @GetMapping("/logs")
    public String hello(){
        return "Hello";
    }
}
