package com.cts.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.db.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
