package ru.netology.hibernate1.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;


@Entity
@Table(name = "persons",schema = "netology")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Person {
    @EmbeddedId
    PersonsCompositePrimaryKey key;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return key != null && Objects.equals(key, person.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}