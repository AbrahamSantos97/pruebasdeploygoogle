package com.example.googletest.googletest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/home"},method = RequestMethod.GET)
public class HomeController {
    
    @GetMapping(value = {"/init"})
    public ResponseEntity<Object> saludo(){
        return ResponseEntity.ok().body("Saludos persona soberana");
    }
}
