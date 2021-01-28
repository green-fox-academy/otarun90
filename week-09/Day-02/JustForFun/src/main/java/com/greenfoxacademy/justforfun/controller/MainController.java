package com.greenfoxacademy.justforfun.controller;

import com.greenfoxacademy.justforfun.model.Message;
import com.greenfoxacademy.justforfun.model.User;
import com.greenfoxacademy.justforfun.service.FoaasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private FoaasService foaasService;


    @Autowired
    public MainController(FoaasService foaasService) {
        this.foaasService = foaasService;
    }

//    @GetMapping("/")
//    public String landingPage (){
//        return "index";
//    }

//    @GetMapping("/")
//    public String landingPage(User user, Model model) {
//        model.addAttribute("messages", foaasService.getApiMessage(user));
//        return "index";
//    }

    @GetMapping("/")
    public String landingPage(Model model) {
        model.addAttribute("messages", foaasService.getMotherFucker());
        return "index";
    }

//    @GetMapping("/random")
//    public String RandomFuckOff(User user, Model model) {
//        model.addAttribute("messages", foaasService.getApiMessage(user));
//        return "index";
//    }

//    @GetMapping("/random")
//    public String RandomFuckOff(@ModelAttribute User user) {
////        if (user != null) {
//            foaasService.getMotherFucker(user);
////            foaasService.deleteUser(user);
//        return "index";
////        }
////        return "index";
//    }
//    @GetMapping("/createname")
//    public String getCreatePost(Model model) {
//        model.addAttribute("user", new User());
//        return "createpost";
//    }

    @PostMapping("/createname")
    public String postCreatePost(@ModelAttribute User user) {
        foaasService.createUser(user);
        return "redirect:/";
    }

//    @GetMapping("/")
//    public String randomFoaas() {
//        return "index";
//    }
}
