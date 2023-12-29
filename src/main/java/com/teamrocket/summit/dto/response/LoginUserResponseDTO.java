package com.teamrocket.summit.dto.response;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class LoginUserResponseDTO {
    private String account;
    private String name;
    private String email;
    private String auth;

}
