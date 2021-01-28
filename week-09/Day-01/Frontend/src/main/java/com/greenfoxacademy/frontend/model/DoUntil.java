package com.greenfoxacademy.frontend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class DoUntil {

    private Integer result;
    private Integer until;

    public DoUntil (String action, Integer until) {
        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 0; i <= until; i++) {
                sum = sum + i;
            }
            this.result = sum;
        }
        if (action.equals("factor")) {
            int factor = 1;
            for (int i = 1; i <= until; i++) {
                factor = factor * i;
            }
            this.result = factor;
        }
    }

}
