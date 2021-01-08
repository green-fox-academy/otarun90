package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.shopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class webshopController {

    private List<shopItems> items = new ArrayList();

    public webshopController() {
        items.add(new shopItems("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        items.add(new shopItems("Printer", "Some HP printer that will print pages", 3000.0, 2));
        items.add(new shopItems("Coca cola", "0.5l standard coke", 25.0, 0));
        items.add(new shopItems("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        items.add(new shopItems("T-shirt", "Blue with corgi on a bike", 300.0, 1));
    }

    @GetMapping("/")
    public String landing(Model model) {
        model.addAttribute("listOfItems", items);
        return "index";
    }

    @GetMapping("/available")
    public String onlyAvailable(Model model) {
        model.addAttribute("listOfItems", items.stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/sort-by-cheapest")
    public String sortByCheapest(Model model) {
        model.addAttribute("listOfItems", items.stream()
                .sorted(Comparator.comparing(shopItems::getPrice))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model){
        model.addAttribute("listOfItems", items.stream()
                .filter(item -> item.getName().toLowerCase().contains("nike")||item.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList()));
                return "index";
    }

    @GetMapping("/most-expensive-available")
    public String mostExpensiveAvailable(Model model) {
        List<shopItems> availableItems = items.stream()
                .filter(s -> s.getQuantityOfStock() != 0)
                .sorted(Comparator.comparing(shopItems::getPrice))
                .collect(Collectors.toList());
        shopItems mostExpensive = availableItems.stream().findFirst().get();
        model.addAttribute("listOfItems", mostExpensive);
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        Double averageStock = items
                .stream()
                .mapToDouble(shopItems::getQuantityOfStock)
                .average()
                .orElse(0);
        model.addAttribute("itemsList", averageStock);
        return "average-stock";
    }

}
