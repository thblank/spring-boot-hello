package com.bee.sample.ch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
@EnableAutoConfiguration
public class Ch1Application {

    public static void main(String[] args) throws Exception {
//        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Ch1Application.class,args);
//        Desktop.getDesktop().browse(new URI("http://127.0.0.1:8080/swagger-ui.html"));
    }

}
