package com.xucharles97.windowwalk.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/person")
    public Person getPerson(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Guest";
        }

        return new Person(name,
                "WindowWalk",
                        new Address("123 Main Street", "San Francisco", "California", "USA"),
                        new Book("The Hunger Games", "Suzanne Collins"));
    }
}

