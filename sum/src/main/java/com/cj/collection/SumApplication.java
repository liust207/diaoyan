package com.cj.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
//@ComponentScan(basePackages=
//        {"com.cj.collection.controller","com.cj.collection.service"})
public class SumApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumApplication.class, args);
    }

}
