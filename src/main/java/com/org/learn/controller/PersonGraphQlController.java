package com.org.learn.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.org.learn.model.Person;
import com.org.learn.repository.PersonRepository;

@Controller
public class PersonGraphQlController
{
	private final PersonRepository repository;

	public PersonGraphQlController(PersonRepository repository)
	{
		this.repository = repository;
	}

	// @SchemaMapping(typeName = "Query", value = "allPeople")
	@QueryMapping
	public Iterable<Person> allPeople()
	{
		return repository.findAll();
	}

	@QueryMapping
	public Page<Person> allPeoplePaged(@Argument int page, @Argument int size)
	{
		PageRequest pr = PageRequest.of(page, size);
		return repository.findAll(pr);
	}
}
