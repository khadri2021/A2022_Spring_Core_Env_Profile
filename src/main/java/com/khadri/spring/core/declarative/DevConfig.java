package com.khadri.spring.core.declarative;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!qat")
public class DevConfig {

    @Bean
    public DevBean1 devBean1(){
        return  new DevBean1();
    }
}
