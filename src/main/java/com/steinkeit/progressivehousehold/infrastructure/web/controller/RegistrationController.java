package com.steinkeit.progressivehousehold.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@SessionScope
public class RegistrationController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Hello world!</h1>";
    }
}
