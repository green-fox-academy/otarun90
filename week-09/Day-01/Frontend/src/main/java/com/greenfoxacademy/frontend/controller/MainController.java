package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.DoUntil;
import com.greenfoxacademy.frontend.service.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    RestAPIService restAPIService;


    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.ok(restAPIService.error("Please provide an input!"));
        }
        return ResponseEntity.ok(restAPIService.getDoubling(input));
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return new ResponseEntity(restAPIService.error("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        }
        if (name == null) {
            return new ResponseEntity(restAPIService.error("Please provide a name!"), HttpStatus.BAD_REQUEST);
        }
        if (title == null) {
            return new ResponseEntity(restAPIService.error("Please provide a title!"), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(restAPIService.getGreetingMessage(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> greeter(@PathVariable(required = false) String appendable){
        if(appendable == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(restAPIService.appendString(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> dountil(@PathVariable String action, @RequestBody DoUntil doUntil) {
        if (action.equals("sum") || action.equals("factor")) {
            return ResponseEntity.ok(new DoUntil(action, doUntil.getUntil()));
        }
        return ResponseEntity.ok(restAPIService.error("Please provide a number!"));
    }


}