package com.teamrocket.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String userAccount;
    private String userName;
    private String userEmail;
    private String userPassword;
    private LocalDateTime userRegDate;
}
