package cn.labujn.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InfoService {
    //    这个 RestTemplate 就是在启动类中托管的bean
    @Autowired
    private RestTemplate restTemplate;

    //服务地址，用注册的名字
    private String service_host = "http://eureka-client1";

    //获取服务提供者的端口号
    @HystrixCommand(fallbackMethod = "Error")
    public String getServiceInfo() {
        //进行远程消费 参数1：请求地址，参数2：返回数据类型
        return restTemplate.getForObject(this.service_host + "/info", String.class);
    }

    //熔断时返回的错误
    public  String Error(){
        return "服务已中断，当前不可用";
    }
}
