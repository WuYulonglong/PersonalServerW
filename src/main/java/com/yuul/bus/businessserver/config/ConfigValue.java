package com.yuul.bus.businessserver.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@RefreshScope
@Configuration
@Data
@ConfigurationProperties("nacos")
public class ConfigValue {
    private String msg;
}
