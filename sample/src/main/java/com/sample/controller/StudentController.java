package com.sample.controller;

import com.sample.domain.Student;
import com.sample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository repository;

    @PostMapping
    public ResponseEntity save(@RequestBody Student student) {
        return ResponseEntity.ok(repository.save(student));
    }

    @GetMapping
    public ResponseEntity find() {
        return ResponseEntity.ok(repository.findAll());
    }

}
