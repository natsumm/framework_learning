package com.bjming.service;

import com.bjming.vo.Student;

public interface StudentService {

    String queryStudentById(String id);

    String addName(String name);

    String getName();

    String addStudent(Student student);

    String getStudent();
}