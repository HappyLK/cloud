package springcloud.feignconsumer.feigin;

import org.springframework.cloud.openfeign.FeignClient;
import springcloud.helloserviceapi.service.HelloService;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 19:20
 * fallback 指定服务降级类
 */
@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface ReFactorHelloService extends HelloService {
}
