package com.example.thymleaf.controller;

import com.example.thymleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(HttpServletRequest req){
        String name = req.getParameter("name");
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam String name) {



        Person p = Person.builder()
                .id(1)
                .name(name)
                .age(25)
                .email("quan@gmail.com")
                .build();
        model.addAttribute("person",p);
        return "hello";
    }
}
