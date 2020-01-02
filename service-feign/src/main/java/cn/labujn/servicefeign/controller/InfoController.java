package cn.labujn.servicefeign.controller;

import cn.labujn.servicefeign.feign.InfoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    private InfoInterface infoInterface;

    @GetMapping("/info")
    public String getInfo() {
        return "feign" + infoInterface.getServiceInfo();
    }
}
