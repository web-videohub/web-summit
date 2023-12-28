package com.teamrocket.summit.service;

import com.teamrocket.entity.DirectMessage;
import com.teamrocket.entity.DirectMessageInfo;
import com.teamrocket.summit.dto.DirectMessageDTO;
import com.teamrocket.summit.dto.DirectMessageInfoDTO;
import com.teamrocket.summit.repository.DirectMessageInfoRepository;
import com.teamrocket.summit.repository.DirectMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DirectMessageService {
    private final DirectMessageInfoRepository directMessageInfoRepository;
    private final DirectMessageRepository directMessageRepository;

    // 메세지를 보내는 기능
    public boolean sendMessage(DirectMessageInfoDTO infoDto, DirectMessageDTO dto) {
        // dmId가 없으면 생성하고 infoDto에 저장
        if(dmIdCheck(dto)) {
            createDMId(dto);
        }

        return directMessageInfoRepository.save(new DirectMessageInfo(infoDto));
    }

    // 메세지 DMId저장하기
    public void createDMId(DirectMessageDTO dto) {
        directMessageRepository.send(new DirectMessage(dto));
    }

    // dmId가 있는지 확인하는 메서드
    public boolean dmIdCheck(DirectMessageDTO dto) {
        Integer id;
        id = directMessageRepository.findId(dto.getUser1Account(), dto.getUser2Account());
        if (id == null) {
            id = directMessageRepository.findId(dto.getUser2Account(), dto.getUser1Account());
            if(id == null)
                return true;
        }

        return false;
    }

    public boolean removeId(DirectMessageDTO dto) {
        Integer id = directMessageRepository.findId(dto.getUser1Account(), dto.getUser2Account());
        return directMessageRepository.delete(id);
    }

    //id를 찾는 메서드
    public int findId(DirectMessageDTO dto) {
        if(dmIdCheck(dto))
            createDMId(dto);
        if(directMessageRepository.findId(dto.getUser1Account(), dto.getUser2Account()) == null)
            return directMessageRepository.findId(dto.getUser2Account(), dto.getUser1Account());
        else
            return directMessageRepository.findId(dto.getUser1Account(), dto.getUser2Account());
    }
}