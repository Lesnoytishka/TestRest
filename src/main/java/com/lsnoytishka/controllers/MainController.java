package com.lsnoytishka.controllers;

import com.lsnoytishka.UnknownEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello world";
    }

    @GetMapping("/{id}")
    public String getHelloWorldWithArgs(@PathVariable("id") Long id) {
        return "You choice [" + id + "] item";
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getPostString(@RequestBody UnknownEntity entity) {
        System.out.println(entity);
    }
}
