package com.avantsoft.filipeinterview.controller;

import com.avantsoft.filipeinterview.model.StudentModel;
import com.avantsoft.filipeinterview.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentModel createStudent(@RequestBody Map<String, Object> body) {
        String name = body.get("name").toString();
        double grade = Double.parseDouble(body.get("grade").toString());
        return service.createStudent(name, grade);
    }

    @GetMapping
    public List<StudentModel> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }
}
