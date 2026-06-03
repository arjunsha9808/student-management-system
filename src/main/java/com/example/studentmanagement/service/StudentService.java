package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save Student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get Student By Id
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Update Student
    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    // Delete Student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
