package com.greenfoxacademy.springstart.model;

public class Greeting {

    Long greetcount;
    String content;

    public Greeting(Long id, String content) {
        this.greetcount = id;
        this.content = content;
    }

    public Long getGreetcount() {
        return greetcount;
    }

    public String getContent() {
        return content;
    }
}
