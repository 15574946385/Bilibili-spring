package com.andrew.song.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${person.name}")
    private String personName;
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
    @RequestMapping("/name")
    public String sayName(){
        System.out.println(name);
        System.out.println(personName);
        return "index";
    }
}
