package com.ta.matrimony.dataacces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta.matrimony.model.Person;

public interface PersonListRepository extends JpaRepository<Person, Integer> {

}
