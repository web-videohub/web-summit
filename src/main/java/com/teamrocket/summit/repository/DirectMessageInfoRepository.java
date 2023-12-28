package com.teamrocket.summit.repository;

import com.teamrocket.entity.DirectMessage;
import com.teamrocket.entity.DirectMessageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DirectMessageInfoRepository {

    // DM 메세지 보내기
    boolean save(DirectMessageInfo info);

    // 메세지 가져오기
    List<DirectMessageInfo> messageList(int dmId);
}
