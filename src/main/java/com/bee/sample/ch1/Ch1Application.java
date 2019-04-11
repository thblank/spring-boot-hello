package com.bee.sample.ch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
public class Ch1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch1Application.class,args);
    }

}
