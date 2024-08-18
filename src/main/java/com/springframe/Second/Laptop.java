package com.springframe.Second;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void run() {
        System.out.println("Laptop Class Is running");
    }
}
