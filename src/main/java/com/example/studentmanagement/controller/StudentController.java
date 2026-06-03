package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get Student By Id
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }
}