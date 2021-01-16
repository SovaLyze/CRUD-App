package com.example.CRUDApp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yurec = new Student(
                    "yurec",
                    "yurec@gmail.com",
                    LocalDate.of(1998, DECEMBER, 9)
            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(1998, JANUARY, 9)
            );

            repository.saveAll(
                    List.of(yurec, alex)
            );
        };
    }
}
