package com.cjg.awesomeshare.pigeon.service;

import com.cjg.awesomeshare.common.dto.ResultDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendRequestDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendResponseDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 16:13
 */
@RequestMapping("/awesome/pigeon/v1")
public interface MessageSendService {

    /**
     * 发送短信
     * */
    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    ResultDTO<MessageSendResponseDTO> sendMessage(@RequestBody  MessageSendRequestDTO messageSendRequestDTO);

}
