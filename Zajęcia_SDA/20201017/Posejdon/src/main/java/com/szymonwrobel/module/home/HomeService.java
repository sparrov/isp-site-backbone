package com.szymonwrobel.module.home;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String getGreetings(){
        return "Hello world";
    }
}
