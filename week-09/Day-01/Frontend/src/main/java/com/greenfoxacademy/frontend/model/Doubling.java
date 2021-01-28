package com.greenfoxacademy.frontend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Doubling {

    int received;
    int result;

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }
}


