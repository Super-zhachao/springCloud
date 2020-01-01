package cn.labujn.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@ FeignClient（“服务名”），来指定调用哪个服务
@FeignClient(value = "eureka-client1")
public interface InfoInterface {
    //获取服务提供者的基本信息
    //通过定义路由的方式调用接口服务
    @GetMapping(value = "/info")
    public String getServiceInfo();
}
