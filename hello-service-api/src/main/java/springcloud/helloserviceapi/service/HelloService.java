package springcloud.helloserviceapi.service;

import org.springframework.web.bind.annotation.*;
import springcloud.helloserviceapi.entity.People;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 19:07
 */
public interface HelloService {

    @GetMapping("/hello4")
    String hello4(@RequestParam(value = "name") String name);

    @PostMapping("/hello5")
    String hello5(@RequestBody People people);
}
