package com.youtube_tutorial.ecommerce_backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    @GetMapping("/test")
    public String getMethodName() {
        return "test";
    }
    
}
