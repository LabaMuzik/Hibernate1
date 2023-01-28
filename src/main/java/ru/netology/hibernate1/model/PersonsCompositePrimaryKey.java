package ru.netology.hibernate1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@RequiredArgsConstructor
public class PersonsCompositePrimaryKey implements Serializable {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "age", nullable = false)
    private int aga;
}