package com.nehemiah.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MAY;
import static java.time.Month.SEPTEMBER;


public interface StudentService {

    Student save(Student student);

    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student update(Student student);

    void delete(String email);


}
