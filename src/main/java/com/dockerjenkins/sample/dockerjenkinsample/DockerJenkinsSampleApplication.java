package com.dockerjenkins.sample.dockerjenkinsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@SpringBootApplication
public class DockerJenkinsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsSampleApplication.class, args);
    }

    @GetMapping
    public String test(){
        return "hello jenkins";
    }

}
