package ru.netology.hibernate1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate1.dao.PersonsRepository;
import ru.netology.hibernate1.model.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonsServiceImpl implements PersonsService {
    private final PersonsRepository repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);

    }
}
