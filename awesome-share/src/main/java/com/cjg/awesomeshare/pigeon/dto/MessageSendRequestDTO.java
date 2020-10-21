package com.cjg.awesomeshare.pigeon.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 16:51
 */
@Data
@ToString
public class MessageSendRequestDTO {

    private String phone;

    private String message;
}
