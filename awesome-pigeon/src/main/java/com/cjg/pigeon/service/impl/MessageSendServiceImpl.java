package com.cjg.pigeon.service.impl;

import com.cjg.awesomeshare.common.dto.ResultDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendRequestDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendResponseDTO;
import com.cjg.awesomeshare.pigeon.service.MessageSendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 17:33
 */
@Slf4j
@Service
@RestController
public class MessageSendServiceImpl implements MessageSendService {
    @Override
    public ResultDTO<MessageSendResponseDTO> sendMessage(@RequestBody  MessageSendRequestDTO messageSendRequestDTO) {
        ResultDTO<MessageSendResponseDTO> resultDTO = new ResultDTO<>();
        log.info("收到发送短信请求，手机号为：{}，发送内容为：{}",messageSendRequestDTO.getPhone(),messageSendRequestDTO.getMessage());
        /**
        * 处理短信发送
        * */
        log.info("短信发送成功啦，十分的nice！");
        return resultDTO.success();
    }
}
