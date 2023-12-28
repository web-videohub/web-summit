package com.teamrocket.summit.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ChatController {

    // 채팅방 메세지 조회
    @GetMapping("/chat/{dmId}")
    public ResponseEntity<?> chatDM(@PathVariable int dmId) {
        log.info("/chat/");

        return null;
    }

//    // 채팅방 생성
//    @PostMapping("/chat")
//    public ResponseEntity<?> createRoom() {
//
//        return null;
//    }

    // 메세지 전송
    @PostMapping("/chat/{dmId}/messages")
    public String sendMessage(@Validated @RequestBody int dmId) {

        log.info("chat : POST");
        log.debug("request parameter : {}", dmId);

        return null;
    }

    // 채팅방 목록 조회
    @GetMapping("/chat")
    public String roomList() {
        log.info("/chat GET!");

        return "index";
    }

}
