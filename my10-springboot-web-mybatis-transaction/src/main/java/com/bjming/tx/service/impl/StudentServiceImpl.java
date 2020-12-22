package com.bjming.tx.service.impl;

import com.bjming.tx.dao.StudentMapper;
import com.bjming.tx.domain.Student;
import com.bjming.tx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return null;
    }

    /**
     * @Transactional: 表示启用事务功能
     * isolation: 隔离级别,
     * propagation: 传播行为
     * timeout: 超时时间, 毫秒单位
     * rollbackFor: 回滚的异常, 如果
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRED,
            timeout = 5000,
            rollbackFor = {Exception.class})
    public int addStudent(Student student) {
        int rows = studentMapper.insertStudent(student);

        //制造异常
        //int i=10/0; //ArithmeticException: 算数异常

        return rows;
    }
}
