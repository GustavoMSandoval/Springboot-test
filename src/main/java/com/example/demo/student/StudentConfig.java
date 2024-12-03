package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student user1 = new Student(
				"Gustavo",
				"teste@gmail.com",
				LocalDate.of(2005, Month.APRIL, 21)
			);
            Student user2 = new Student(
				"mariam",
				"teste.mariam@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 21)
			);

            repository.saveAll(List.of(user1,user2));
        };
    }
}
