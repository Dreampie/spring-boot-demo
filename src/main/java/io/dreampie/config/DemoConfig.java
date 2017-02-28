package io.dreampie.config;

import io.dreampie.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangrenhui on 2017/2/28.
 */
@Configuration
public class DemoConfig {
    @Autowired
    DemoService demoService;

    @Bean
    public String testBean() {
        System.out.println(demoService.getClass());
        return "";
    }

}
