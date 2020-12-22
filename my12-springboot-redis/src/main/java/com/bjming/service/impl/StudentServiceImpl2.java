package com.bjming.service.impl;

import com.bjming.service.StudentService;
import com.bjming.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl2 implements StudentService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String queryStudentById(String id) {
        return null;
    }

    @Override
    public String addName(String name) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        /*redisTemplate.setKeySerializer(new StringRedisSerializer(Charset.forName("utf-8")));
        redisTemplate.setValueSerializer(new StringRedisSerializer(Charset.forName("utf-8")));*/
        redisTemplate.opsForValue().set("name", name);

        return "添加名称," + name;
    }

    @Override
    public String getName() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        /*redisTemplate.setKeySerializer(new StringRedisSerializer(Charset.forName("utf-8")));
        redisTemplate.setValueSerializer(new StringRedisSerializer(Charset.forName("utf-8")));*/
        String name = (String) redisTemplate.opsForValue().get("name");
        return "name==>" + name;
    }

    @Override
    public String addStudent(Student student) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set("student1", student);
        return "添加了学生: " + student.toString();
    }

    @Override
    public String getStudent() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Student student = (Student) redisTemplate.opsForValue().get("student1");
        return student.toString();
    }
}
