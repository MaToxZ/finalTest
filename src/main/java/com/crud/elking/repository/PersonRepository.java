package com.crud.elking.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.elking.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
