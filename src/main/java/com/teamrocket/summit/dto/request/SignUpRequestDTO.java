package com.teamrocket.summit.dto.request;

import com.teamrocket.summit.entity.Member;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class SignUpRequestDTO {

    @NotBlank
    @Size(min = 4, max = 20)
    private String userAccount;

    @NotBlank
    private String userPassword;

    @NotBlank
    @Size(min = 2, max = 6)
    private String userName;

    @NotBlank
    @Email
    private String userEmail;

    public Member toEntity(PasswordEncoder encoder) {
        return Member.builder()
                .userAccount(userAccount)
                .userPassword(encoder.encode(userPassword))
                .userName(userName)
                .userEmail(userEmail)
                .build();
    }
}
