package springcloud.ribbonconsumer.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import springcloud.ribbonconsumer.service.HelloService;

import javax.annotation.Resource;

/**
 * @author V_Happy.L.K
 * @date 2018/12/16 18:10
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        return restTemplate.getForEntity("http://hello-service/hello"
                , String.class).getBody();
    }

    public String helloFallback(){
        return "helloFallback error";
    }
}
