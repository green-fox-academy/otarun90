package com.greenfoxacademy.usefulutilities.controller;

import com.greenfoxacademy.usefulutilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private UtilityService utilityService;

    @GetMapping("/useful")
    public String useful(){
        return "index";
    }

    @GetMapping ("/useful/colored")
    public String colored (Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "random-color";
    }

    @GetMapping ("/useful/email")
    public String email (@RequestParam String email, Model model){
        if (utilityService.validateEmail(email)){
            model.addAttribute("color", "green");
            model.addAttribute("message", email + " is a valid email address");
            return "emailValidation";
        }
        model.addAttribute("color", "red");
        model.addAttribute("message", email + " is not a valid email address");
        return "emailValidation";
    }

//    @PostMapping("/useful/caesar-encoder")
//    public String caesarEncoder (String textToEncode, Integer numberForEncode, Model model){
//        model.addAttribute("text", utilityService.caesar(textToEncode, numberForEncode));
//        return "caesarText";
//    }
//
//    @PostMapping ("/useful/caesar-decoder")
//    public String caesarDecoder (String textToDecode, Integer numberForDecode, Model model){
//        model.addAttribute("text", utilityService.caesar(textToDecode, (-1)*(numberForDecode)));
//        return "caesarText";
//    }
}

