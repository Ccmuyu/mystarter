package com.zzw.config;

import com.zzw.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装载bean
 * @author zhenwei.wang 2019/5/10
 */
@Configuration
@ConditionalOnClass(value = MyService.class)
@EnableConfigurationProperties(MyConfigProps.class)
public class MyConfigAutoConfigure {

    @Autowired
    MyConfigProps myConfigProps;

    MyService myService() {
        return new MyService(myConfigProps.getConfig());
    }


}
