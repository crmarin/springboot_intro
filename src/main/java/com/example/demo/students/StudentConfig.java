package com.example.demo.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student demo = new Student(
            1L,
            "Mariam",
            "aa@aa.com",
                LocalDate.of(2000, Month.JUNE, 23)
            );

            studentRepository.saveAll(
                    List.of(demo)
            );
        };
    }
}
