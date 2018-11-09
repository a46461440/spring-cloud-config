package com.springboot.config.config;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudConfigApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
