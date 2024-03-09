package ru.netology;

import java.util.Objects;


public class Person {


    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder newChildBuilder() {
        return  new PersonBuilder().setSurname(surname).setAge(0);
    }


    public void setCity(String city) {
        this.city = city;
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        return !city.isEmpty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}







