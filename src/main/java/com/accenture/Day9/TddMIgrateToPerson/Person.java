package com.accenture.Day9.TddMIgrateToPerson;

import com.accenture.tdd.MaxValues;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String city;

    public Person(String firstName, String lastName, Integer age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String concatFirstNameLastName() {
        return firstName + " " + lastName;
    }

    public static MaxValues compareToAge(List<Person> personList) {
        if (personList != null && personList.size() > 1) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (Person p : personList) {
                if (p.age == null) {
                    return null;
                } else if (p.age > secondMax && p.age > max) {
                    secondMax = max;
                    max = p.age;
                } else if (p.age > secondMax) {
                    secondMax = p.age;
                }
            }
            return new MaxValues(max, secondMax);
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
