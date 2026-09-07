package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/{name}")
    public String getHelloWorld(@PathVariable String name, @RequestParam String age) {
        return "Hello " + name + ", your age is " + age;
    }
}


