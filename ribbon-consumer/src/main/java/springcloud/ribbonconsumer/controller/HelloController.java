package springcloud.ribbonconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.ribbonconsumer.service.HelloService;

import javax.annotation.Resource;

/**
 * @author V_Happy.L.K
 * @date 2018/12/16 17:35
 */
@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForEntity("http://hello-service/hello"
                , String.class).getBody();
    }

    /**
     * 添加hystrix 熔断功能
     * @return
     */
    @GetMapping("/hello2")
    public String hello2() {
        System.out.println("ddddd");
        System.out.println("ddddd");
        System.out.println("ddddd");
        System.out.println("ddddd");
        System.out.println("ddddd");
        System.out.println("ddddd");
        System.out.println("ddddd");
        return helloService.hello();
    }


}
