package com.bjming.service.impl;

import com.bjming.service.StudentService;
import com.bjming.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 注入redis的模板
     */
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String queryStudentById(String id) {
        String value = (String) redisTemplate.opsForValue().get(id);

        if (value == null) {
            System.out.println("没有从redis数据库中查询到所需数据, 从数据库中查询, 并放入redis");
            value = "张三, 18岁";
            redisTemplate.opsForValue().set(id, value);
        }

        return value;
    }

    @Override
    public String addName(String name) {
        redisTemplate.opsForValue().set("name", name);
        return "添加了name: " + name;
    }

    @Override
    public String getName() {
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }

    @Override
    public String addStudent(Student student) {
        redisTemplate.opsForHash().put("student", "name", student.getName());
        redisTemplate.opsForHash().put("student", "age", student.getAge());
        return "添加了学生, " + student.toString();
    }

    @Override
    public String getStudent() {
        String name = (String) redisTemplate.opsForHash().get("student", "name");
        Integer age = (Integer) redisTemplate.opsForHash().get("student", "age");
        return "name=" + name + ", age=" + age;
    }
}
