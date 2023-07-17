package com.khadri.spring.core.programatic;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("qat")
public class QATConfig {

    @Bean
    public QatBean1 qatBean1() {
        return new QatBean1();
    }
    @Bean
    public QatBean2 qatBean2() {
        return new QatBean2();
    }
    @Bean
    public QatBean3 qatBean3() {
        return new QatBean3();
    }
}
