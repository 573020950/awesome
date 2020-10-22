package com.cjg.order.web.controller;

import com.cjg.order.proxy.PigeonFeignClient;
import com.cjg.order.service.OrderService;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther Tianpenghao
 * @date Created in 2020/10/21 17:12
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/rest/awesome/createOrder", method = RequestMethod.GET)
    public void createOrder(@RequestParam("orderId")String orderId , HttpServletRequest request , HttpServletResponse response){
        log.info("请求开始，入参{}",orderId);
        orderService.createOrder(orderId);
    }
}
