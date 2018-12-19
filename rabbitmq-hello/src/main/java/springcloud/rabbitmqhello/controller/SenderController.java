package springcloud.rabbitmqhello.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SenderController {
    @Resource
    private AmqpTemplate amqpTemplate;

    @GetMapping("/send")
    public String send() {
        String msg = "hello rabbitmq";
        amqpTemplate.convertAndSend("hello", msg);
        return "send success";
    }
}
