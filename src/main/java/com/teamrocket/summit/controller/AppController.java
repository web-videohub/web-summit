package com.teamrocket.summit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    @GetMapping("/")
    public String redirectToLogin() {

        return "/members/sign-in";
    }

    @RequestMapping("/sign-up")
    public String register() {
        System.out.println("회원가입화면");

        return "/members/sign-up";
    }

}
