package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/home")
    public String homePage() {
        return "Котограм";
    }
}