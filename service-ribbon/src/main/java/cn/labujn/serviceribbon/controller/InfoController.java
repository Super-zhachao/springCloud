package cn.labujn.serviceribbon.controller;

import cn.labujn.serviceribbon.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public String getInfo() {
        return infoService.getServiceInfo();
    }
}
