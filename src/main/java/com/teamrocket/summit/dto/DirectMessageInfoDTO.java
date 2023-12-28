package com.teamrocket.summit.dto;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectMessageInfoDTO {
    private int dmId;
    private String senderAccount;
    private String content;
}
