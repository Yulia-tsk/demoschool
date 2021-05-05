package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(
                new Student(UUID.randomUUID(), "Sofia", "Gulieva", "gsofa@gmail.com", Student.Gender.FEMALE),
                new Student(UUID.randomUUID(), "Yulia", "Atyaskina", "atyaskina@bk.ru", Student.Gender.FEMALE),
                new Student(UUID.randomUUID(), "Sergey", "Atyaskin", "atyaskin@bk.ru", Student.Gender.MALE)

        );
    }
}
