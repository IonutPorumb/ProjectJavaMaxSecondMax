package com.accenture.Day9.TddMIgrateToPerson;

import com.accenture.tdd.MaxValues;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Person(String firstName, String lastName, int age, String city) {
        if (firstName == null || firstName.equals("")) {
            this.firstName = "First Name was not allocated!";
        } else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.equals("")) {
            this.lastName = "Last Name was not allocated!";
        } else {
            this.lastName = lastName;
        }
        this.age = age;
        if (city == null || city.equals("")) {
            this.city = "No city was allocated!";
        } else {
            this.city = city;
        }
    }

    public int compareTo(Person person){
        return Math.max(this.age, person.age);
    }


    public String concatFirstNameLastName() {
        return firstName + " " + lastName;
    }

    public static MaxValues compareToAge(List<Person> personList) {
        if (personList != null && personList.size() > 1) {
                Person max = personList.get(0).compareTo(personList.get(1)) > 0 ?
                        personList.get(0) : personList.get(1);
                Person secondMax = personList.get(0).compareTo(personList.get(1)) >0 ?
                        personList.get(0) : personList.get(1);
                for (int i = 2; i < personList.size(); i++) {
                    if (personList.get(i).age > secondMax.age && personList.get(i).age > max.age) {
                        secondMax = max;
                        max = personList.get(i);
                    } else if (personList.get(i).age > secondMax.age) {
                        secondMax = personList.get(i);
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
