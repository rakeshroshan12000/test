package com.example.mapper.MapperDemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
public class TestApiController {
    private final ApiMapper mappers;
    @GetMapping("/test")
    public TestDTO assignUserPlan(){
        return mappers.map("Success");
    }
}
