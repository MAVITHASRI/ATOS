package com.example.spring1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meow")
public class mavispring {

    // GET
    // POST
    // PUT
    // UPDATE
    
    // DELETE
    @GetMapping("/hello")
    public String hello() {P
        return "Hello Meow";
    }
@GetMapping("/home")
    public String home() {
        return "Welcome to Home";
    }

    public int add(int a,int b){
        return (a+b);
    }
}