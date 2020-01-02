package cn.labujn.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //配置当前为消费者
@EnableHystrix //开启Hystrix
@EnableHystrixDashboard //开启Hystrix 仪表盘
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean
    //给当前restRemplate开启负载均衡
    @LoadBalanced
        //使用RestTemplate消费相关服务
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
