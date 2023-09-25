package com.example.controller;

import com.example.model.Student;
import com.example.repo.StudentRepo;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.serde.annotation.Serdeable;
import lombok.RequiredArgsConstructor;

@Controller(value = "/student")
@RequiredArgsConstructor
public class StudentController {
    private  final StudentRepo student;

    @Get("/read")
    public Iterable<Student> read(){
        return student.findAll();
    }

    @Post("/create")
    public Student createWithBody(@Body Student student){
        return  this.student.save(student);
    }

//    @Post("/update")
}
