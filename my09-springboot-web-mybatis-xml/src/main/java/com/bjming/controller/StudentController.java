package com.bjming.controller;

import com.bjming.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 根据前端传入的id查询
     *
     * @param id
     * @return
     */
    @RequestMapping("/queryStudentById")
    @ResponseBody
    public Object queryStudentById(Integer id) {
        System.out.println("queryStudentById方法执行, id==>" + id);
        //"编号为 "+id+"查询到的学生为: "
        return "查询到编号为:" + id + "的学生信息为===>" + studentService.queryStudentById(id).toString();
    }

}
