package springcloud.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author V_Happy.L.K
 * @date 2018/12/16 17:17
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello cloud!";
    }
}
