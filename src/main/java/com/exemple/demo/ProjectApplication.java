package com.exemple.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.exemple.demo.services.AdminRestServices;
import com.exemple.demo.services.ClientRestServices;
import com.exemple.demo.services.LivraisonRestServices;
import com.exemple.demo.services.FactureRestServices;
import com.exemple.demo.services.CommandeRestServices;
import com.exemple.demo.services.PieceRestServices;

@SpringBootApplication
@EntityScan("com.exemple.demo.entities")
@EnableJpaRepositories

public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
