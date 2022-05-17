package com.coinbuyingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoinbuyingEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinbuyingEurekaApplication.class, args);
    }

}
