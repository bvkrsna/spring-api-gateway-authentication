package com.springsecurity.employee_svcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeSvcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSvcsApplication.class, args);
	}

}
