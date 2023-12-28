package com.teamrocket.summit.service;

import com.teamrocket.summit.dto.DirectMessageDTO;
import com.teamrocket.summit.dto.DirectMessageInfoDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DirectMessageServiceTest {

    @Autowired
    DirectMessageService directMessageService;

    @Test
    @DisplayName("보내는 사람이 smg0218이고 받는 사람이 tester인 DM메세지를 생성한다")
    void dmSendTest() {
        //given
        DirectMessageDTO dto = DirectMessageDTO.builder()
                .user1Account("smg0218")
                .user2Account("tester")
                .build()
                ;

        //when
        boolean flag = directMessageService.dmIdCheck(dto);
        directMessageService.createDMId(dto);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("보내는 사람이 smg0218이고 받는 사람이 tester인 DM메세지 id를 삭제한다.")
    void dmRemoveTest() {
        //given
        DirectMessageDTO dto = DirectMessageDTO.builder()
                .user1Account("smg0218")
                .user2Account("tester")
                .build()
                ;


        //when
        boolean flag = directMessageService.removeId(dto);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("smg0218이 tester를 향해 DM메세지를 보내면 저장되어야 한다.")
    void messageSendTest() {
        //given
        DirectMessageDTO dto = DirectMessageDTO.builder()
                .user1Account("smg0218")
                .user2Account("tester2")
                .build()
                ;

        DirectMessageInfoDTO infoDto = DirectMessageInfoDTO.builder()
                .dmId(directMessageService.findId(dto))
                .senderAccount(dto.getUser1Account())
                .content("DM 테스트")
                .build()
                ;

        //when
        boolean flag = directMessageService.sendMessage(infoDto, dto);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("tester2가 smg0218를 향해 DM메세지를 보내면 저장되어야 한다.")
    void messageSendTest2() {
        //given
        DirectMessageDTO dto = DirectMessageDTO.builder()
                .user1Account("tester2")
                .user2Account("smg0218")
                .build()
                ;

        DirectMessageInfoDTO infoDto = DirectMessageInfoDTO.builder()
                .dmId(directMessageService.findId(dto))
                .senderAccount(dto.getUser1Account())
                .content("DM 테스트2")
                .build()
                ;

        //when
        boolean flag = directMessageService.sendMessage(infoDto, dto);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("tester가 smg0218을 향해 메세지를 보내면 id가 생성되고 저장되어야 한다.")
    void messageSendTest3() {
        //given
        DirectMessageDTO dto = DirectMessageDTO.builder()
                .user1Account("tester")
                .user2Account("smg0218")
                .build()
                ;

        DirectMessageInfoDTO infoDTO = DirectMessageInfoDTO.builder()
                .dmId(directMessageService.findId(dto))
                .senderAccount("tester")
                .content("dm 테스트3")
                .build();

        //when
        boolean flag = directMessageService.sendMessage(infoDTO, dto);

        //then
        assertTrue(flag);
    }

}