package com.teamrocket.summit.repository;

import com.teamrocket.entity.DirectMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DirectMessageRepository {

    // DM 정보 등록
    boolean send(DirectMessage message);

    // 닉네임으로 DM 정보 조회
    Integer findId(String senderName, String receiverName);

    // DM 정보 삭제
    boolean delete(long dmId);
}
