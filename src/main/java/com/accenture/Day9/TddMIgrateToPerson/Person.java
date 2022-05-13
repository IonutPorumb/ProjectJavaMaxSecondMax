package com.accenture.Day9.TddMIgrateToPerson;

import com.accenture.tdd.MaxValues;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Person(String firstName, String lastName, int age, String city) {
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
            if (personList.get(0) != null && personList.get(1) != null) {
                Person max = personList.get(0).age > personList.get(1).age ?
                        personList.get(0) : personList.get(1);
                Person secondMax = personList.get(0).age <= personList.get(1).age ?
                        personList.get(0) : personList.get(1);
                for (int i = 2; i < personList.size();i++) {
                    if (i < personList.size()-2 && personList.get(i) == null ) {
                        continue;
                    } else if (personList.get(i).age > secondMax.age && personList.get(i).age > max.age) {
                        secondMax = max;
                        max = personList.get(i);
                    } else if (personList.get(i).age > secondMax.age) {
                        secondMax = personList.get(i);
                    }
                }
                return new MaxValues(max, secondMax);
            }
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
