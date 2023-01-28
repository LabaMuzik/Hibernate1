package ru.netology.hibernate1.service;

import ru.netology.hibernate1.model.Person;

import java.util.List;

public interface PersonsService {
    List<Person> getPersonsByCity(String city);
}
