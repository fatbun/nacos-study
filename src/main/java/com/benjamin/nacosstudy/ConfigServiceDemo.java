package com.benjamin.nacosstudy;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceDemo {

    @NacosInjected
    private ConfigService configService;
    
    public String demoGetConfig() {
        try {
            String dataId = "mynacos.yml";
            String group = "DEFAULT_GROUP";
            String content = configService.getConfig(dataId, group, 5000);
        	System.out.println(content);

        	return content;
        } catch (NacosException e) {
            e.printStackTrace();
        }

        return null;
    }
}