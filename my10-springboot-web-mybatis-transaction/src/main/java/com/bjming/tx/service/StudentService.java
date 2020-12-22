package com.bjming.tx.service;

import com.bjming.tx.domain.Student;

public interface StudentService {

    Student queryStudentById(Integer id);

    int addStudent(Student student);
}
