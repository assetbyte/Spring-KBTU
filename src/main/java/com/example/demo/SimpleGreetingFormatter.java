package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.greeting.fancy", havingValue = "false")
public class SimpleGreetingFormatter implements GreetingFormatter {
    @Override
    public String format(String name, String age) {
        return "Hello, " + name + " your age is " + age;
    }
}