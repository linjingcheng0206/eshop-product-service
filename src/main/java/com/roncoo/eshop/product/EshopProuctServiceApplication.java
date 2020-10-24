package com.roncoo.eshop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author linjingcheng
 * @data 2020/10/17
 */
@SpringBootApplication
@EnableEurekaClient
public class EshopProuctServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EshopProuctServiceApplication.class);
    }
}
