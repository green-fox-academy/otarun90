package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    String name;
    Double balance;
    String animalType;
    String currency;
    Boolean isKing;

    public BankAccount(String name, Double balance, String animalType, String currency, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.isKing=isKing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public Boolean getKing() {
        return isKing;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBalanceWithDecimalAndCurrency (){
        return String.format("%.2f",balance)+" "+getCurrency();
    }

    public boolean King (){
        if (isKing.equals(true)){
            return true;
        }return false;
    }

}
