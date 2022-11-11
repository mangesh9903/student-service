package com.bridgelabz.studentservice.service;

import com.bridgelabz.studentservice.model.Student;

public interface StudentService {

    Student getById(int id);

    Student getByName(String name);

    boolean save(Student student);

}
