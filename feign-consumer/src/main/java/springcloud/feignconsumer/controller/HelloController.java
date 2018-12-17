package springcloud.feignconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.feignconsumer.entity.People;
import springcloud.feignconsumer.feigin.HelloService;

import javax.annotation.Resource;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 14:59
 */
@RestController
public class HelloController {
//    @Resource
//    private HelloService helloService;
//
//    @GetMapping("/hello")
//    public String hello() {
//        return helloService.hello();
//    }
//    @GetMapping("/hello1")
//    public String hello1() {
//        return helloService.hello1("name");
//    }
//    @GetMapping("/hello2")
//    public String hello2() {
//        return helloService.hello2(new People());
//    }
}
