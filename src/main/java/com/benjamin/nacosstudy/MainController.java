package com.benjamin.nacosstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ConfigServiceDemo configServiceDemo;
    @Autowired
    private NamingServiceDemo namingServiceDemo;

    @Value(value = "${xxoo:abc}")
    private String xxoo;
    @Value(value = "${server.port}")
    private Integer port;

    @GetMapping("/getConfig")
    public String getConfig() {
        return configServiceDemo.demoGetConfig();
    }

    @GetMapping("/registerInstance")
    public void registerInstance() {
        namingServiceDemo.demoRegisterService();
    }

    @GetMapping("/getValue")
    public String getValue() {
        return xxoo;
    }

    @GetMapping("/getPort")
    public Integer getPort() {
        return port;
    }
}
