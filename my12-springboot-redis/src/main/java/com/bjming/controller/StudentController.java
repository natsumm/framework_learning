package com.bjming.controller;

import com.bjming.service.StudentService;
import com.bjming.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    @Qualifier(value = "studentServiceImpl2")
    private StudentService studentService;

    @GetMapping("/student/{name}")
    public String queryStudentByName(@PathVariable String name) {
        return studentService.queryStudentById(name);
    }

    @PostMapping("/name/{name}")
    public String addName(@PathVariable(value = "name") String name) {
        return studentService.addName(name);
    }

    @GetMapping("/name")
    public String getName() {
        return studentService.getName();
    }

    @PostMapping("/student/{name}/{age}")
    public String addStudent(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        return studentService.addStudent(student);
    }

    @GetMapping("/student")
    public String getStudent() {
        return studentService.getStudent();
    }
}
