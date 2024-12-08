package com.forcicd.cicddeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CicddeploymentApplication {

    public static void main(String[] args) {


        SpringApplication.run(CicddeploymentApplication.class, args);
    }
}


