package springcloud.feignconsumer.feigin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import springcloud.feignconsumer.entity.People;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 14:55
 *
 * @FeignClient  注解写在接口上  value是服务的名称不区分大小写
 * 通过注解中配置的服务名回去相应的服务中找到对应的接口进行请求
 */
//@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    /**
     * 注意注解中的是value一定 不能少 feign 是通过value属性名和参数进行绑定的
     */
    @GetMapping("/hello1")
    String hello1(@RequestParam(value = "name") String name);

    @PostMapping("/hello2")
    String hello2(@RequestBody People people);

}
