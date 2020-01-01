package cn.labujn.servicefeign.feignHystrix;

import cn.labujn.servicefeign.feign.InfoInterface;
import org.springframework.stereotype.Component;

@Component
public class InfoInterfaceHystrix implements InfoInterface {
    @Override
    public String getServiceInfo() {
        return "getServiceInfo 服务当前不可用";
    }
}
