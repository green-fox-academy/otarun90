package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.*;
import org.springframework.stereotype.Service;

@Service
public class RestAPIService {


    public Doubling getDoubling(int received){
        return new Doubling(received);
    }

    public RestError error(String message){
        return new RestError(message);
    }

    public Greeter getGreetingMessage (String name, String title){
        Greeter greeter = new Greeter();
        greeter.setWelcome_message(name, title);
        return greeter;
    }

    public Append appendString (String appendable){
        return new Append(appendable);
    }

//    public UntilNumber DoUntilResult(String action, Integer until) {
//        if (action.equals("sum")) {
//            int sum = 0;
//            for (int i = 0; i <= until; i++) {
//                sum = sum + i;
//            }
//            this.result = sum;
//        }
//        if (action.equals("factor")) {
//            int factor = 1;
//            for (int i = 1; i <= until; i++) {
//                factor = factor * i;
//            }
//            this.result = factor;
//        }

//    public ChangedUntilValue sumUntil (Integer changeUntil){
//        ChangedUntilValue changedUntilValue = new ChangedUntilValue();
//        Integer result = 0;
//        for (int i = 0; i < changeUntil; i++) {
//            result += i;
//        }
//        changedUntilValue.setResult();
//    }

}
