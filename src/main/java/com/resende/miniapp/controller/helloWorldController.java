package com.resende.miniapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá! Este é o miniapp 🚀";
    }
}
