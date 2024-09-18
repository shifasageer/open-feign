package com.iiht.feignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.iiht.feignproduct.service")
@SpringBootApplication
public class FeignProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignProductServiceApplication.class, args);
	}

}
