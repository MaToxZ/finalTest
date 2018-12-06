package com.crud.elking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.elking.model.Person;
import com.crud.elking.repository.PersonRepository;



@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/findAll")
	public List<Person> findAll(){
		return (List<Person>) personRepository.findAll();
	}
	
	@PostMapping("/create")
	public Person create(@Valid @RequestBody Person p) {
		return personRepository.save(p);
	}
}
