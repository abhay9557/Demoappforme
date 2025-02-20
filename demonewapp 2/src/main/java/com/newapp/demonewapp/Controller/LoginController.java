package com.newapp.demonewapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController
{
    @RequestMapping("/login")
    public String login(){
        return "Log in is not found";
    }
}
