package com.springframe.Second;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public void run(){
        System.out.println("Desktop Class Is Running");
    }
}
