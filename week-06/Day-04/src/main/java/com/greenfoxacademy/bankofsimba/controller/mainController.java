package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class mainController {

    BankAccount simba = new BankAccount("Simba", 2000.00, "lion","Zebra", true);

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("name",simba.getName());
        model.addAttribute("balance",simba.getBalanceWithDecimalAndCurrency());
        model.addAttribute("animalType",simba.getAnimalType());
        return "show";
    }

    @GetMapping("/HTMLception")
    public String htmlCeption(Model model){
        model.addAttribute("htmlception","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }

    private List<BankAccount> bankaccounts = new ArrayList();

    public mainController(){
        bankaccounts.add(new BankAccount("Timon", 9000.00,"meerkat","Bugs", true));
        bankaccounts.add(new BankAccount("Pumbaa", 1500.00,"warthog","Bugs", false));
        bankaccounts.add(new BankAccount("Simba", 3000.00,"lion","Bugs",true));
        bankaccounts.add(new BankAccount("Mufasa", 8000.00,"lion","Bugs", true));
        bankaccounts.add(new BankAccount("Nala", 9000.00,"lion","Bugs", false));
    }

    @GetMapping("/accountlist")
    public String landing(Model model){
        model.addAttribute("listOfAccounts", bankaccounts);
        return "accountlist";
    }

}
