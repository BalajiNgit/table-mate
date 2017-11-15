package com.example.greeting.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.Greeting;

@RestController
@EnableAutoConfiguration
public class GreetingMsg {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
	@RequestMapping("/greetings")
    String home() {
		System.out.println("Hello World!");
        return "Hello World!";
    }
	
	@RequestMapping("/greetingss")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
