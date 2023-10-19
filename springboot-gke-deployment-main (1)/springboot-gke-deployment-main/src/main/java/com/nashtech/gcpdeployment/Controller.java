package com.nashtech.gcpdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello_page() {
        return "Hello NashTech!!!";
    }
}
