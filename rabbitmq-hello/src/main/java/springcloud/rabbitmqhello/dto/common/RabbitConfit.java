package springcloud.rabbitmqhello.dto.common;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfit {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
