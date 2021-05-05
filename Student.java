package com.example.demo.student;

import java.util.UUID;

public class Student {
    public Student(UUID uuid, String firstName, String lastName, String email, Gender gender) {
        this.id = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    enum Gender{
        MALE,
        FEMALE
    }
}
