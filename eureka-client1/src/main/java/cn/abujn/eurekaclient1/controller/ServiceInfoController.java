package cn.abujn.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInfoController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/info")
    public String home() {
        return "server port :" + this.port;
    }
}
