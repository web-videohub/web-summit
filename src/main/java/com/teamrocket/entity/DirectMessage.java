package com.teamrocket.entity;

import com.teamrocket.summit.dto.DirectMessageDTO;
import lombok.*;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectMessage {
    private int dmId;
    private String user1Account;
    private String user2Account;

    public DirectMessage(DirectMessageDTO dto) {
        this.user1Account = dto.getUser1Account();
        this.user2Account = dto.getUser2Account();
    }
}
