package com.shakirali.bakery;

import com.shakirali.bakery.entity.Admin;
import com.shakirali.bakery.repository.AdminRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BakeryManagerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BakeryManagerApplication.class, args);

		AdminRepo repo = context.getBean(AdminRepo.class);

		System.out.println(repo.findAll());
	}

}
