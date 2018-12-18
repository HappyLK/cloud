package springcloud.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author V_Happy.L.K
 * @date 2018/12/18 11:09
 */
@RestController
public class ForwardController {

    @GetMapping("/local/forward")
    public String forwardTest(){
        return "forward";
    }
}
