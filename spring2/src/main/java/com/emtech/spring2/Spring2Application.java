package com.emtech.spring2;

import com.emtech.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Spring2Application {

    public static void main(String[] args) {

        SpringApplication.run(Spring2Application.class, args);
    }
    @GetMapping
    public List<Student> hallo(){
      return List.of(
              new Student(
              1L,
              "Eliud Njogu ",
              "emuriuki@emtechhouse.co.ke",
                      LocalDate.of(1980, Month.JULY,29),
         40
        )

        ) ;

    }

}
