package it.repository;

import it.model.Person;


import java.util.List;

public interface PersonRepository  {
    void save(Person person);

    void deleteById(Long id);

    Person findById(Long id);

    List<Person> findAll();

    void update(Person person, Long id);

}
