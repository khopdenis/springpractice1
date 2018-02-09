package ru.liga.contract;

import ru.liga.domain.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

    void save(List<Person> persons);

}
