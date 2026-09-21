package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingFormatter greetingFormatter;
    public GreetingService(GreetingFormatter greetingFormatter) {
        this.greetingFormatter = greetingFormatter;
    }

    public String buildGreetingMessage(String name, String age) {
        return greetingFormatter.format(name, age);
    }
}