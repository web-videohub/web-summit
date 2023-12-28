package com.teamrocket.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private String dm_id;
    private String content;
    private LocalDateTime message_time;
}
