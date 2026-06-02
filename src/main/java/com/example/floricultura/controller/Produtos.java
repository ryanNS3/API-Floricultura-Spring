package com.example.floricultura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class Produtos {
    @GetMapping
    public String Hello(){
        return "hello";
    }
}
