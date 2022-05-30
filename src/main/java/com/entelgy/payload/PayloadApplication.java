package com.entelgy.payload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // hace un scaneo en los paquetes de este mismo con @ComponentScan
public class PayloadApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PayloadApplication.class, args);
	}
}

