/*package com.org.learn.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.learn.model.Person;
import com.org.learn.repository.PersonRepository;

@RestController
@RequestMapping("/api/people")
public class PersonController
{
	private final PersonRepository repository;

	public PersonController(PersonRepository repository)
	{
		this.repository = repository;
	}

	@GetMapping
	public Page<Person> findAll(@RequestParam int page, @RequestParam int size, @RequestParam String sort)
	{
		PageRequest pr = PageRequest.of(page, size, Sort.by(sort));
		return repository.findAll(pr);
	}
}
*/