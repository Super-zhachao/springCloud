package cn.labujn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    //远程配置文件对应的字段
    @Value("${foo}")
    private String foo;

    @GetMapping(value = "version")
    public String getVersion() {
        return foo;
    }
}
