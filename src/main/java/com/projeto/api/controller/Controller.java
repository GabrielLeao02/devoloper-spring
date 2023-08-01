package com.projeto.api.controller;

import com.projeto.api.model.person.entitie.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String message() {
        return "Hello world!";
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome " + name;
    }

    @PostMapping("/person")
    public Person getPerson(@RequestBody Person person) {
        return person;
    }

}
