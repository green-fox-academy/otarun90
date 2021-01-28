package com.greenfoxacademy.frontend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Append {

    private String appended;

    public Append(String appendable) {
        this.appended = appendable + "a";
    }

//    public void setAppended(String appended) {
//        this.appended = appended;
//    }
//
//    public String getAppended() {
//        return appended;
//    }

}
