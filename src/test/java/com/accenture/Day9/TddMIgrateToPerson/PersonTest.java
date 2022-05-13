package com.accenture.Day9.TddMIgrateToPerson;

import com.accenture.tdd.MaxValues;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void compareToAgeWhenListIsNull() {

        assertNull(Person.compareToAge(null));
    }

    @Test
    void compareToAgeWhenListHasOneElement() {

        assertNull(Person.compareToAge(List.of(new Person("Ana", "Constantin", 23, "Oradea"))));
    }


    @Test
    void compareToAgeWhenMoreThen2ValuesArePresentInList() {
        Person person1 = new Person("Ana", "Constantin", 23, "Oradea");
        Person person12 = new Person("Ana", "Dobrin", 46, "Oradea");
        Person person2 = new Person("Daniel", "Popa", 16, "Iasi");
        Person person3 = new Person("Monica", "Munteanu", 30, "Bucuresti");
        Person person4 = new Person("Mihai", "Lupu", 15, "Oradea");
        Person person5 = new Person("Sergiu", "Potra", 67, "Cluj-Napoca");
        Person person6 = new Person("Stefania", "Marcu", 67, "Cluj-Napoca");
        Person person7 = new Person("Ioana", "Popescu", 27, "Timisoara");
        Person person8 = new Person("Andrei", "Maier", 13, "Brasov");
        Person person9 = new Person("Gheorghe", "Constantin", 65, "Timisoara");
        Person person10 = new Person("David", "Comanescu", 26, "Oradea");
        Person person11 = new Person("Daniel", null, 16, "Iasi");

        List<Person> personList = new ArrayList<>(List.of(person1, person2, person3, person4,
                person5, person6, person7, person8, person9, person10, person11, person12));
        assertEquals(new MaxValues(person5, person6), Person.compareToAge(personList));
    }
}