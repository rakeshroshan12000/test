package com.example.mapper.MapperDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MapperDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapperDemoApplication.class, args);
	}

}
