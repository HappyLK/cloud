package springcloud.helloservice.controller;

import org.springframework.web.bind.annotation.*;
import springcloud.helloservice.entity.People;

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
    @GetMapping("/hello1")
    public String hello1(@RequestParam String name){
        return "hello cloud1!";
    }
    @PostMapping("/hello2")
    public String hello2(@RequestBody People people){
        return "hello cloud People!";
    }
    @GetMapping("/hello3")
    public String hello3(){
        return "hello cloud!";
    }
}
