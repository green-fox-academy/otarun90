package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {

    @GetMapping("/greeting")
    public Greeting hello2(){
            return new Greeting(1L,  "Hello, World!");
            }

    @GetMapping("/greet")
    public Greeting hello3(@RequestParam String name){
        return new Greeting(1L, "Hello, " + name + "!");
    }

    AtomicLong atomiclong = new AtomicLong();
    @GetMapping("/greet/keepcounting")
    public Greeting hello4(@RequestParam String name){
        return new Greeting((atomiclong.getAndIncrement()+9000), "Hello, " + name + "!");
    }
}
