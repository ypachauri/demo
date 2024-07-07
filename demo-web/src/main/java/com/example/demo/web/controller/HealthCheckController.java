package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/status")
public class HealthCheckController {

    @RequestMapping(path = "/healthcheck", method = RequestMethod.GET)
    public Map<String, Object> sayHello() {
        Map<String, Object> response = new HashMap<>();
        response.put("healthy", "true");

        return response;
    }
}

