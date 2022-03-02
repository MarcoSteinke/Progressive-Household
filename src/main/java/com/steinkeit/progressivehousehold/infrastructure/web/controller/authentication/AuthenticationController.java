package com.steinkeit.progressivehousehold.infrastructure.web.controller.authentication;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@SessionScope
public class AuthenticationController {

    @GetMapping("/")
    public String index(Authentication authentication) {
        return "index";
    }
}
