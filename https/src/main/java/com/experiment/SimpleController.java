package com.experiment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String getHome() {
        return "Simple HTTPS Springboot Application";
    }

    @GetMapping("/another")
    public String getSomeRoute() {
        return "Another HTTPS endpoint";
    }
}
