package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String buildGreetingMessage(String name, String age) {
        return "Hello, " + name + " your age is " + age;
    }
}
