package com.teamrocket.summit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    @RequestMapping("/")
    public String home() {
        System.out.println("어서오셈");

        return "index";
    }

}
