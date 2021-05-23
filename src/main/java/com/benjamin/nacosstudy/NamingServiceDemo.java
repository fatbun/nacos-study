package com.benjamin.nacosstudy;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.stereotype.Service;

@Service
public class NamingServiceDemo {

    @NacosInjected
    private NamingService namingService;
    
    public void demoRegisterService() {
        try {
            namingService.registerInstance("mynacos", "192.168.101.95", 8080);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
}