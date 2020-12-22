package com.bjming.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjming.service.StudentService;
import com.bjming.vo.Student;
import org.springframework.stereotype.Component;

/**
 * @Component: 注解, 暴露接口的真正实现类必须放到容器中才能起到作用
 * @Service: 使用dubbo的注解Service注解, 表示暴露接口, 可以设置接口名, 版本, 和超时时间
 */
@Component
@Service(interfaceClass = StudentService.class, version = "1.0", timeout = 5000)
public class StudentServiceImpl implements StudentService {

    @Override
    public Student getStudentById(String id) {
        Student student = new Student();
        if ("1".equals(id)) {
            student.setId(id);
            student.setName("zhangsan");
            student.setAge(19);
        } else {
            student.setId(id);
            student.setName("lisi");
            student.setAge(25);
        }
        return student;
    }
}
