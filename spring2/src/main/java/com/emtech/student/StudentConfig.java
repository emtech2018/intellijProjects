package com.emtech.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
         Student eliud = new Student(

                 "Eliud",
                 "emuriuki@emtechhouse.co.ke",
                 LocalDate.of(1980, Month.JULY,29)
         );
            Student peter = new Student(

                    "Peter",
                    "peter@gmail.com",
                    LocalDate.of(1981, Month.JULY,31)
            );
            repository.saveAll(
                    List.of(eliud,peter)
            );
        };
    }
}
