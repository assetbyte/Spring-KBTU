package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name = "app.greeting.fancy", havingValue = "true")
public class FancyGreetingFormatter implements GreetingFormatter {
    @Override
    public String format(String name, String age) {
        return "Welcome, dear " + name + "! You are " + age + " years old!";
    }
}