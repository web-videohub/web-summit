package com.teamrocket.summit.service;

import com.teamrocket.summit.dto.request.LoginRequestDTO;
import com.teamrocket.summit.dto.request.SignUpRequestDTO;
import com.teamrocket.summit.dto.response.LoginUserResponseDTO;
import com.teamrocket.summit.entity.Member;
import com.teamrocket.summit.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.teamrocket.summit.service.LoginResult.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;
    private final PasswordEncoder encoder;

    public boolean join(SignUpRequestDTO dto) {
        return memberMapper.save(dto.toEntity(encoder));
    }

    public LoginResult authenticate(
            LoginRequestDTO dto,
            HttpSession session,
            HttpServletResponse response
            ) {

        Member foundMember = getMember(dto.getUserAccount());

        if (foundMember == null) {
            log.info("{} - 회원가입이 필요함", dto.getUserAccount());
            return NO_ACC;
        }

        // 비번 일치검사
        String inputPassword = dto.getUserPassword();
        String realPassword = foundMember.getUserPassword();

        if(!encoder.matches(inputPassword, realPassword)) {
            log.info("비밀번호가 일치하지 않습니다.");
            return NO_PW;
        }

        log.info("{}님 로그인 성공", foundMember.getUserAccount());
        return SUCCESS;
    }

    public Member getMember(String account) {
        return memberMapper.findMember(account);
    }

    public void maintainLoginState(HttpSession session, String userAccount) {

        Member member = getMember(userAccount);

        LoginUserResponseDTO dto = LoginUserResponseDTO.builder()
                .account(member.getUserAccount())
                .email(member.getUserEmail())
                .name(member.getUserName())
                .auth(member.getUserAuth().name())
                .build();

        session.setAttribute("login", dto);
        session.setMaxInactiveInterval(60 * 60);
    }

    public boolean checkDuplicateValue(String type, String keyword) {
        return memberMapper.isDuplicate(type, keyword);
    }
}
