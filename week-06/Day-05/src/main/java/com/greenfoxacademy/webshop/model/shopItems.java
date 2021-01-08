package com.greenfoxacademy.webshop.model;

public class shopItems {

    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;
    private String currency = "CZK";

    public shopItems(String name, String description, Double price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPriceWithDecimalAndCurrency (){
        return String.format("%.2f",price)+" "+getCurrency();
    }

}
