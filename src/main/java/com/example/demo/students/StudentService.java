package com.example.demo.students;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents () {
        return List.of(new Student(1L, "cristian",  "crmarin@gmail.com",  LocalDate.of(1984, Month.JUNE, 23), 40));
    }
}
