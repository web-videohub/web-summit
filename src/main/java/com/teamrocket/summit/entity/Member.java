package com.teamrocket.summit.entity;

import lombok.*;

import java.net.Authenticator;
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
    private Auth            userAuth;
    private LocalDateTime   userRegDate;
    private String          sessionId;
    private LocalDateTime   limitTime;

}
