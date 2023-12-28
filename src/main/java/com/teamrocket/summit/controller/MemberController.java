package com.teamrocket.summit.controller;

import com.teamrocket.summit.dto.request.LoginRequestDTO;
import com.teamrocket.summit.dto.request.SignUpRequestDTO;
import com.teamrocket.summit.service.LoginResult;
import com.teamrocket.summit.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

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
        log.info("parameter : {}", dto);

        LoginResult result = memberService.authenticate(dto, request.getSession(), response);
        log.debug("parameter : {}", dto);

        ra.addFlashAttribute("msg", result);

        if(result == LoginResult.SUCCESS) {  // 로그인 성공시

            //makeLoginCookie(dto, response);  // 쿠키로 로그인 유지

            // 세션으로 로그인 유지
            memberService.maintainLoginState(request.getSession(), dto.getUserAccount());

            return "redirect:/";
        }
        return ""; // 로그인 실패시

    }

    @GetMapping("/register")
    public String register() {
        System.out.println("회원가입화면");

        return "/members/sign-up";
    }

    @GetMapping("/check")
    @ResponseBody
    public ResponseEntity<?> check(String type, String keyword) {
        log.info("/members/check?type={}&keyword={} ASYNC GET", type, keyword);
        boolean flag = memberService.checkDuplicateValue(type, keyword);
        log.debug("중복체크 결과 : {}", flag);
        return ResponseEntity.ok().body(flag);
    }

    @PostMapping("/register")
    public String register(SignUpRequestDTO dto) {
        log.info("parameter : {}", dto);

        boolean flag = memberService.join(dto);
        return flag ? "redirect:/" : "redirect:/login";
    }
}
