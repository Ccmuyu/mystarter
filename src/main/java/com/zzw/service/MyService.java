package com.zzw.service;

import org.apache.commons.lang3.StringUtils;

/**
 * 真正需要注入的bean
 * @author zhenwei.wang 2019/5/10
 */
public class MyService {
    private String config;

    public MyService(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }
}
