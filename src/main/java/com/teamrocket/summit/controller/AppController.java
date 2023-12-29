package com.teamrocket.summit.controller;

import com.teamrocket.summit.util.LoginUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AppController {
    @GetMapping("/")
    public String redirectToLogin(HttpSession session) {

        if (!LoginUtils.isLogin(session)) {
            return "redirect:/login";
        }
        return "redirect:/channels/@me";
    }

    @GetMapping("/channels/@me")
    public String mainScreen() {

        return "/channels-me";
    }


}
