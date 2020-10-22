package com.cjg.order.service.impl;

import com.cjg.awesomeshare.common.dto.ResultDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendRequestDTO;
import com.cjg.awesomeshare.pigeon.dto.MessageSendResponseDTO;
import com.cjg.order.proxy.PigeonFeignClient;
import com.cjg.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 17:12
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private PigeonFeignClient pigeonFeignClient;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public void createOrder(String orderId) {
        /**
         * 此处处理落订单逻辑
         * DOTO
         * 根据登录信息查到客户手机号，暂时mock
         * */
        //异步发送短信
        threadPoolTaskExecutor.execute(()->{
            MessageSendRequestDTO messageSendRequestDTO = new MessageSendRequestDTO();
            messageSendRequestDTO.setPhone("12345678901");
            messageSendRequestDTO.setMessage("您好，您的订单已经收到，稍后为你发货，感谢使用。");
            ResultDTO<MessageSendResponseDTO> resultDTO =  pigeonFeignClient.sendMessage(messageSendRequestDTO);
            if(resultDTO.isSuccess()){
                log.info("已通知消息服务发送成功！");
            }
        });

        log.info("正常响应前端请求！！！");
    }
}
