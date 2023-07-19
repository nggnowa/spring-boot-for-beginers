package com.nehemiah.springdemo.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("{email}")
    public Student findByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("{email}")
    public void delete(@PathVariable String email) {
        studentService.delete(email);
    }
}
