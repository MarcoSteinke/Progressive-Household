package com.steinkeit.progressivehousehold.infrastructure.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@SessionScope
public class RegistrationController {

    @GetMapping("/")
    @ResponseBody
    public String index(Authentication authentication) {
        return String.format("<h1>Hello %s!</h1>", authentication.getName());
    }
}
