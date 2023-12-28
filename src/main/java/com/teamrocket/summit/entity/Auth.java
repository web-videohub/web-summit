package com.teamrocket.summit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter @ToString
public enum Auth {
    COMMON("일반 회원", 1)
    , ADMIN("관리자", 2)
    ;

    private final String description;
    private final int authNumber;
}
