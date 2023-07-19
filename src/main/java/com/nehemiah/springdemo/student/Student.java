package com.nehemiah.springdemo.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private Integer age;
}
