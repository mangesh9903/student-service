package com.bridgelabz.studentservice.service.impl;

import com.bridgelabz.studentservice.model.Student;
import com.bridgelabz.studentservice.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getById(int id) {
        Student student = new Student();
        student.setId(id);
        student.setName("Mangesh");
        student.setMobileNo("7777777777");
        return student;
    }

    @Override
    public Student getByName(String name) {
        Student student = new Student();
        student.setId(2);
        student.setName(name);
        student.setMobileNo("7777777777");
        return student;
    }

    @Override
    public boolean save(Student student) {
        System.out.println("Id- " + student.getId() + ", Name- " + student.getName() + ", Mobile Number- " + student.getMobileNo());
        return false;
    }
}
