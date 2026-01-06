package com.xucharles97.windowwalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Goodbye Cruel World...";
    }
}

