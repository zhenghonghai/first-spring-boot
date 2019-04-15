package com.example.demo.demo.controller;

import com.example.demo.demo.service.LoginService;
import modules.login.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public List<Login> getLogin(){
        System.out.println("我来了----controller");
        return loginService.getLogin();
    }
}
