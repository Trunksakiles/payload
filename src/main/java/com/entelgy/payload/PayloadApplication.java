package com.entelgy.payload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication  // hace un scaneo en los paquetes de este mismo con @ComponentScan
@ImportResource("classpath:/beans.xml")
public class PayloadApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PayloadApplication.class, args);
	}
}

