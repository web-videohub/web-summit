package com.teamrocket.entity;

import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private String dmId;
    private String content;
    private LocalDateTime messageTime;
}
