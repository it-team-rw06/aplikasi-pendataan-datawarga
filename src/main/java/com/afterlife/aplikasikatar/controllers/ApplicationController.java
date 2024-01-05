package com.afterlife.aplikasikatar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping(value = "/401")
    public String get401(){
        return "401";
    }

    @GetMapping(value = "/404")
    public String get404(){return "404";}

    @GetMapping(value = "/500")
    public String get500(){return "500";}

    @GetMapping(value = "/index")
    public String getIndex(){return "index";}

    @GetMapping(value = "/login")
    public String getLogin(){return "login";}

    @GetMapping(value = "/password")
    public String getPassword(){return "password";}

    @GetMapping(value = "/register")
    public String getRegister(){return "register";}

    @GetMapping(value = "/tables")
    public String getTable(){return "tables";}
}
