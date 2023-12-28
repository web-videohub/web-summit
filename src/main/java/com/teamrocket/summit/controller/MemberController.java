package com.teamrocket.summit.controller;

import com.teamrocket.summit.dto.request.LoginRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/login")
    public String login() {
        log.info("/login GET : forwarding to login.jsp");

        return "index";
    }

    @PostMapping("/login")
    public String signIn(
            LoginRequestDTO dto,
            RedirectAttributes ra,
            HttpServletResponse response,
            HttpServletRequest request
    ) {

        log.info("/members/sign-in POST !");
        log.debug("parameter : {}", dto);

        //LoginResult result = memberService.authenticate(dto, request.getSession(), response);
        //log.debug("login result : {}", result);

        //ra.addFlashAttribute("msg", result);

        //if(result == LoginResult.SUCCESS) {  // 로그인 성공시
        //
        //    //makeLoginCookie(dto, response);  // 쿠키로 로그인 유지
        //
        //    // 세션으로 로그인 유지
        //    memberService.maintainLoginState(request.getSession(), dto.getAccount());
        //
        //    return "redirect:/";
        //}
        return "redirect:/login"; // 로그인 실패시

    }

    @GetMapping("/register")
    public String register() {
        System.out.println("회원가입 화면");

        return "/members/sign-up";
    }
    @PostMapping("/register")
    public String signUp() {
        System.out.println("회원가입 처리");

        return "";
    }

    @GetMapping("/find-pw")
    public String findPassword() {
        System.out.println("비밀번호 찾기 화면");

        return "/members/find-pw";
    }
    @PostMapping("/find-pw")
    public String findPw() {
        System.out.println("비밀번호 찾기 처리");

        return "";
    }

}
