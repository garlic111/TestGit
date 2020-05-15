package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

//使用注解开启断路器功能
@EnableCircuitBreaker
@SpringBootApplication
public class AtguiguMainTypeProvider {

	public static void main(String[] args) {
		SpringApplication.run(AtguiguMainTypeProvider.class, args);
	}
}
