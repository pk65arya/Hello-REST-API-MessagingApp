package com.Assignment.controller;

import com.Assignment.entity.User;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/hello")
    public String getFirstLastName(@RequestBody User user){
        return "Hello "+user.getFirstName() +" "+user.getLastName() +"From BridgeLabz";
    }
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloWithput(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + "from BridgeLabz";
    }
}
