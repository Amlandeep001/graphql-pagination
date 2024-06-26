package com.org.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.learn.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>
{
}
