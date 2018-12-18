package springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope:
 * 启动类 EurekaProviderApplication 通过 @RefreshScope 开启 SpringCloudConfig 客户端的 refresh 刷新范围，来获取服务端的最新配置，
 * @RefreshScope要加在声明@Controller声明的类上，否则refresh之后Conroller拿不到最新的值，会默认调用缓存。
 */
@RestController
@RefreshScope
public class TestConfigController {

    @Value("${form}")
    private String form;

    @GetMapping("getForm")
    public String getForm() {
        return form;
    }
}
