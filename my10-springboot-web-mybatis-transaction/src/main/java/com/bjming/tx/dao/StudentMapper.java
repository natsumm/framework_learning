package com.bjming.tx.dao;

import com.bjming.tx.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student selectStudentById(@Param("id") Integer id);

    int insertStudent(Student student);
}
