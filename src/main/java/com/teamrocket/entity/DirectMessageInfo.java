package com.teamrocket.entity;

import com.teamrocket.summit.dto.DirectMessageInfoDTO;
import lombok.*;

import java.time.LocalDateTime;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectMessageInfo {
    private int messageId;
    private int dmId;
    private String senderAccount;
    private String content;
    private LocalDateTime messageTime;

    public DirectMessageInfo(DirectMessageInfoDTO infoDto) {
        this.dmId = infoDto.getDmId();
        this.senderAccount = infoDto.getSenderAccount();
        this.content = infoDto.getContent();
    }
}
