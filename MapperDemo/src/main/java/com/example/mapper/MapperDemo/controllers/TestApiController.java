package com.example.mapper.MapperDemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RefreshScope
@RestController
@Validated
@RequiredArgsConstructor
public class TestApiController {

    @Value("${msg}")
    private String message;

    private final ApiMapper mappers;

    @GetMapping("/test")
    public TestDTO assignUserPlan(){
        return mappers.map(message);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
