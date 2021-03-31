package com.example.mapper.MapperDemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@Validated
@RequiredArgsConstructor
public class TestApiController {

    private final ApiMapper mappers;

    @GetMapping("/test")
    public TestDTO assignUserPlan(){
        return mappers.map("Success");
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
