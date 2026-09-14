package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    private final GreetingService greetingService;
    private final AppProperties appProperties;

    public HelloWorldController(GreetingService greetingService, AppProperties appProperties) {
        this.greetingService = greetingService;
        this.appProperties = appProperties;
    }

    @GetMapping("/{name}")
    public String getHelloWorld(@PathVariable String name, @RequestParam String age) {
        return greetingService.buildGreetingMessage(name, age);
    }

    @GetMapping("/config")
    public String getConfigInfo() {
        return String.format("App Name: %s | Timeout: %d ms | Max Users: %d",
                appProperties.getName(),
                appProperties.getTimeout(),
                appProperties.getMaxUsers());
    }
}