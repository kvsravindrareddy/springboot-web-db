package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootWebDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebDbApplication.class, args);
	}

//	@Scheduled(fixedDelay = 2000)
//	public void runAlways() {
//		System.out.println("---------");
//	}
}