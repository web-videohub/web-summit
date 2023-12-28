package com.teamrocket.summit.repository;

import com.teamrocket.entity.Message;

public interface MessageMapper {

    // 댓글 등록
    boolean send(Message message);

    // 댓글 수정
    boolean modify(Message message);

    // 댓글 삭제
    boolean delete(long message_id);
}
