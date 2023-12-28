package com.teamrocket.summit.entity;

import lombok.*;

import java.time.LocalDateTime;

@ToString @Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private String          userAccount;
    private String          userName;
    private String          userEmail;
    private String          userPassword;
    private LocalDateTime   userRegDate;

}
