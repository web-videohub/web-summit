package com.teamrocket.summit.repository;

import com.teamrocket.summit.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberMapperTest {
    @Autowired
    MemberMapper memberMapper;
    @Test
    @DisplayName("회원가입에 성공하면 좋겠다")
    void saveTest() {
        //given
        Member member = Member.builder()
                .userAccount("yongseop00")
                .userPassword("1234")
                .userName("나는용섭")
                .userEmail("test@test.com")
                .build();
        //when
        boolean flag = memberMapper.save(member);
        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("yongseop00 계정을 조회하면 그 회원의 이름이 나는용섭이어야 한다.")
    void findMemberTest() {
        //given
        String acc = "yongseop00";
        //when
        Member foundMember = memberMapper.findMember(acc);
        //then
        assertEquals("나는용섭", foundMember.getUserName());
    }

    @Test
    @DisplayName("계정명이 aaa일 경우 결과값은 false여야함")
    void duplicateTest() {
        //given
        String acc = "aaa";
        //when
        boolean flag = memberMapper.isDuplicate("account", acc);
        //then
        assertFalse(flag);
    }

}