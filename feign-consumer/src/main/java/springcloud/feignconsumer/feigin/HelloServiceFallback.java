package springcloud.feignconsumer.feigin;

import org.springframework.stereotype.Component;
import springcloud.feignconsumer.entity.People;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 20:11
 *
 * feign中的熔断降级  定义一个类实现service接口， 然后在service接口中@FeignClient
 * 注解中的fallback属性来指定熔断降级类
 * eg:   @FeignClient(value="hello-service", fallback=HelloServiceFallback.class)
 */
@Component
public class HelloServiceFallback implements ReFactorHelloService {

    @Override
    public String hello4(String name) {
        return "error";
    }

    @Override
    public String hello5(springcloud.helloserviceapi.entity.People people) {
        return "error";
    }
}
