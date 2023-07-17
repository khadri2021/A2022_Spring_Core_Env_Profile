package com.khadri.spring.core.programatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev","qat");
        context.register(DevConfig.class);
        context.register(QATConfig.class);
        context.refresh();

        DevBean1 devBean1 = context.getBean(DevBean1.class);
        System.out.println(devBean1);

        DevBean2 devBean2 = context.getBean(DevBean2.class);
        System.out.println(devBean2);

        DevBean3 devBean3 = context.getBean(DevBean3.class);
        System.out.println(devBean3);

        QatBean1 qatBean1 = context.getBean(QatBean1.class);
        System.out.println(qatBean1);




    }
}