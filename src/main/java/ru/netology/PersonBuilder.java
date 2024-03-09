package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Не заполнено имя");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не заполнена фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }


    public PersonBuilder setAge(int age) {
        if (age < -1 || age > 100) {
            throw new IllegalArgumentException("Неверный возраст");
        } else {
            this.age = age;
        }
        return this;
    }


    public  PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }


    public Person build() {
        if (name != null && surname != null) {
            return new Person(name, surname, age, city);
        } else {
            throw new IllegalStateException("Не заполнены обязательные поля");
        }
    }

}



