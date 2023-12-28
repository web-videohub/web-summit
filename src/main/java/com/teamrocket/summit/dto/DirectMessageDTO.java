package com.teamrocket.summit.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectMessageDTO {
    @NotBlank
    private String user1Account;
    @NotBlank
    private String user2Account;
}
