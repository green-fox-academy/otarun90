package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.Status;
import com.greenfoxacademy.demo.model.StatusAndPath;
import com.greenfoxacademy.demo.service.RandomStatusService;
import com.greenfoxacademy.demo.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private Status status = Status.whatdoesthefoxsay;
    @Autowired
    private UtilityService utilityService;
    @Autowired
    private RandomStatusService randomStatusService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("musiclink", randomStatusService.getPath(status));
        model.addAttribute("imagelink", randomStatusService.getImagePath(status));
        return "index";
    }

    @GetMapping ("/background")
    public String background (Model model){
        model.addAttribute("backgroundLink", utilityService.randomColor());
        model.addAttribute("musiclink", randomStatusService.getPath(status));
        model.addAttribute("imagelink", randomStatusService.getImagePath(status));
        return "index";
    }

    @GetMapping ("/musiclink")
    public String music (Model model){
        status = randomStatusService.randomStatus();
        model.addAttribute("musiclink", randomStatusService.getPath(status));
        model.addAttribute("imagelink", randomStatusService.getImagePath(status));
        return "index";
    }

}
