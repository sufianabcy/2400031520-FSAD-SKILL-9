package com.klu.globalexception.controller;

import com.klu.globalexception.entity.Student;
import com.klu.globalexception.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

        private final StudentService studentService;

        public StudentController(StudentService studentService) {
                this.studentService = studentService;
        }

        @GetMapping("/{id}")
        public ResponseEntity<Student> getStudent(@PathVariable int id) {
                return ResponseEntity.ok(studentService.getStudentById(id));
    }
}
