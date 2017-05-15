package com.cuixingchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by cuipengfei on 17-5-15.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerApp.class, args);
    }
}
