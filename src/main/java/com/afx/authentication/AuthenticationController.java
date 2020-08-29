package com.afx.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "auth")
public class AuthenticationController {
    
    @RequestMapping("/")
    public String authenticate() {
        return "Hello";
    }

}