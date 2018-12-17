package springcloud.feignconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.feignconsumer.feigin.ReFactorHelloService;
import springcloud.helloserviceapi.entity.People;

import javax.annotation.Resource;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 19:22
 *
 * 使用继承接口的
 *  优点：
 *      service层不用复制粘贴服务提供方controller的方法代码
 *      直接通过继承的方式实现代码的功用
 *  缺点：
 *      当服务方修改了接口的定义， 可能调用方构建时可能就会失败
 *      可能后期的维护可能会变得麻烦（要做好后期的拓展预防）
 */
@RestController
public class RefactorHelloController {

    /**
     * 注入hello层   继承hello-service-api的接口
     */
    @Resource
    private ReFactorHelloService reFactorHelloService;

    /**
     * 分别调用service接口中的方法即可
     * @return
     */

    @GetMapping("/hello4")
    public String hello4() {
        return reFactorHelloService.hello4("张三");
    }

    @PostMapping("/hello5")
    public String hello5() {
        return reFactorHelloService.hello5(new People());
    }
}
