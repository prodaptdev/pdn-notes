package com.pro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PdnNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdnNotesApplication.class, args);
	}

}
