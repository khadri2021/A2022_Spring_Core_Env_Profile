package com.khadri.spring.core.programatic;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
@ComponentScan(basePackages = "com.khadri.spring.core")
public class DevConfig {
    @Bean
    public DevBean1 devBean1() {
        return new DevBean1();
    }
    @Bean
    public DevBean2 devBean2() {
        return new DevBean2();
    }
    @Bean
    public DevBean3 devBean3() {
        return new DevBean3();
    }
}
