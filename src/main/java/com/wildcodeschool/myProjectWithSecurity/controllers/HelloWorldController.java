package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @RolesAllowed("CHAMPION")
    @RequestMapping("/avengers/assemble")
    public String getChampion() {
        return "Avengers...Assemble";
    }

    @RolesAllowed("DIRECTOR")
    @RequestMapping("/secret-bases")
    public String getDirector() {
        return "Nantes, Toulouse, Lyon, Paris";
    }
}
