package com.niq.activate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.niq.activate"})
@EntityScan(basePackages = {"com.niq.activate.entity"})
@EnableJpaRepositories(basePackages = {"com.niq.activate.repository"}) // Specify the package where repositories are located
public class NielseniqActivateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NielseniqActivateServiceApplication.class, args);
	}

}
