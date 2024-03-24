package com.org.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

@SpringBootApplication
public class GraphqlPagingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(GraphqlPagingApplication.class, args);
	}

	@Bean
	Faker faker()
	{
		return new Faker();
	}

	// @Bean
	// public CommandLineRunner runner(PersonRepository repository) {
	// return args -> {
	// // do stuff
	// };
	// }
}
