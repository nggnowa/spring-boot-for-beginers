package com.nehemiah.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao studentDao;

    public InMemoryStudentService(InMemoryStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public List<Student> findAllStudents() {

        return studentDao.findAllStudents();

    }

    @Override
    public Student findByEmail(String email) {
        return studentDao.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public void delete(String email) {
        studentDao.delete(email);
    }
}
