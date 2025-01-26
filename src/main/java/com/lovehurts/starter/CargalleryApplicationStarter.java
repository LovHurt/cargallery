package com.lovehurts.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.lovehurts"})
@EntityScan(basePackages = {"com.lovehurts"})
@EnableJpaRepositories(basePackages = {"com.lovehurts"})
@SpringBootApplication
public class CarGalleryApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(CarGalleryApplicationStarter.class, args);
	}

}