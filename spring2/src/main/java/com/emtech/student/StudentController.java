package com.emtech.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path="api/emtech/student")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){

    return studentService.getStudents();

    }

    @PostMapping
    public  void registerNewStudent(@RequestBody Student student){
     studentService.addNewStudent(student);
    }
}
