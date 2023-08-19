package com.Assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/home")
    public String home(){
        return "Hello From BridgeLabz";
    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello "+name+"From BridgeLabz";
    }
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello "+name+ "From BridgeLabz";
    }
}
