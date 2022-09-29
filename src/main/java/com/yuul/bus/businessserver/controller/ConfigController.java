package com.yuul.bus.businessserver.controller;

import com.yuul.bus.businessserver.config.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigController {
    @Autowired
    ConfigValue configValue;

    @RequestMapping("/")
    public String showConfigValue(){
        return configValue.getMsg();
    }
}
