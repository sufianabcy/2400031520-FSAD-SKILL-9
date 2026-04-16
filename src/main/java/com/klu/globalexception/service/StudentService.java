package com.klu.globalexception.service;

import com.klu.globalexception.entity.Student;
import com.klu.globalexception.exception.InvalidInputException;
import com.klu.globalexception.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = List.of(
            new Student(101, "Abu", "CSE"),
            new Student(102, "Rahul", "ECE")
    );

    public Student getStudentById(int id) {
        if (id <= 0) {
            throw new InvalidInputException("Student id must be greater than zero");
        }

        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with id " + id + " not found"));
    }
}
