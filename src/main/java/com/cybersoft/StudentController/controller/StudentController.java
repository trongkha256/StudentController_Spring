package com.cybersoft.StudentController.controller;


import com.cybersoft.StudentController.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public ArrayList<Student> students;

    @GetMapping
    public Object getStudent() {
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    //Request body:
    @PostMapping("")
    public Object saveStudent(@RequestBody Student student) {
        students.add(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Request Param:
    @GetMapping("")
    public Object paraStudent2(@RequestParam("name") String name, @RequestParam("age") int age) {
        students.add(new Student(name,age));
        return students;
    }

    //PathVariable:
    @GetMapping("/{name}/{age}")
    public Object paraStudent3(@PathVariable String name, @PathVariable int age ) {
        students.add(new Student(name,age));
        return students;
    }


}
