package springcloud.helloservice.controller;

import org.springframework.web.bind.annotation.RestController;
import springcloud.helloserviceapi.entity.People;
import springcloud.helloserviceapi.service.HelloService;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 19:15
 */
@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String hello4(String name) {
        return "hello4" + name;
    }

    @Override
    public String hello5(People people) {
        return "hello5 people";
    }
}
