package com.khadri.spring.core.declarative;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DevConfig.class);
        context.getEnvironment().setDefaultProfiles("default");
        DevBean1 devBean1 = context.getBean(DevBean1.class);
        System.out.println(devBean1);


    }
}
