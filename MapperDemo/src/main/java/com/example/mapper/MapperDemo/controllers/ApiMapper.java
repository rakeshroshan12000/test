package com.example.mapper.MapperDemo.controllers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiMapper {

    TestDTO map(String msg);

}
