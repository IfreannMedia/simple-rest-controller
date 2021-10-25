package com.ifreann.spring.rest.simplerestcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SimpleRestControllerApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SimpleRestControllerApplication.class, args);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(bean -> System.out.println("got bean: " + bean));
    }

}
