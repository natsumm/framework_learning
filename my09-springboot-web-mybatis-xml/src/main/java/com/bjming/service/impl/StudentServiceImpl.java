package com.bjming.service.impl;

import com.bjming.mapper.StudentMapper;
import com.bjming.model.Student;
import com.bjming.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired //idea提示, 推荐声明在set方法上, 不推荐直接声明在属性上
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }
}
