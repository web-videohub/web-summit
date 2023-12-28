package com.teamrocket.summit.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class ChatController {

    // 채팅방 메세지 조회
    @GetMapping("/chat/{dmId}/messages")
    public ResponseEntity<?> chatDM(@PathVariable int dmId) {

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
    public ResponseEntity<?> sendMessage(@Validated @RequestBody int dmId
    , BindingResult result) {
        if(result.hasErrors()) {
            return ResponseEntity
                    .badRequest()
                    .body(result.toString())
                    ;
        }

        log.info("/api/v1/chat : POST");
        log.debug("request parameter : {}", dmId);

        return null;
    }

    // 채팅방 목록 조회
    @GetMapping("/rooms")
    public ResponseEntity<?> roomList() {
        log.info("/api/v1/chat/room ");
        return null;
    }

}
