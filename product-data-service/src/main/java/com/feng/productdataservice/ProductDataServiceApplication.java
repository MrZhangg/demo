package com.feng.productdataservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProductDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductDataServiceApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(@RequestParam(value="name",defaultValue = "feng")String name){
        return "Hi "+name+",i am from port:"+port;
    }

}
