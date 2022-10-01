package com.dockerjenkins.sample.dockerjenkinsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class controller {

    @GetMapping
    public String test(){
        return "hello";
    }

    @GetMapping("/jenkins")
    public String testJenkins(){
        return "hello jenkins";
    }
}
