package springcloud.rabbitmqhello.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RestController;

@RabbitListener(queues = "hello")
@RestController
public class ReceiveController {

    /**
     * 参数为队列中的内容， 名字随便起
     * @param a
     */
    @RabbitHandler
    public void receive(String a) {
        System.out.println("receive = " + a);
    }
}
