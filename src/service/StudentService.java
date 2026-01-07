package com.avantsoft.filipeinterview.service;

import com.avantsoft.filipeinterview.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<StudentModel> students = new ArrayList<>();
    private long currentId = 1;

    public StudentModel createStudent(String name, double grade) {
        validateGrade(grade);
        char uniqueLetter = findFirstUniqueLetter(name);
        StudentModel student = new StudentModel(currentId++, name, grade, uniqueLetter);
        students.add(student);
        return student;
    }

    public List<StudentModel> getAllStudents() {
        return students;
    }

    public StudentModel getStudentById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private void validateGrade(double grade) {
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Grade must be between 0 and 10");
        }
    }

    private char findFirstUniqueLetter(String name) {
        String lower = name.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (lower.indexOf(c) == lower.lastIndexOf(c)) {
                return c;
            }
        }
        return '_';
    }
}
