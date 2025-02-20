package com.edson.tarea1_Silva_Rodriguez.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class holamundo {

    @GetMapping("/hello")   
    public String helloword(){
        return "Hola Spring!";
    }
    
}
