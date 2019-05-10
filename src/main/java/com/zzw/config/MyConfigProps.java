package com.zzw.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 对需要注入bean的属性配置读取
 * @author zhenwei.wang 2019/5/10
 */
@ConfigurationProperties("example.service")
public class MyConfigProps {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
