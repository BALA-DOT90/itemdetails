package com.item.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.item.details"})
public class ItemDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemDetailsApplication.class, args);
	}

}