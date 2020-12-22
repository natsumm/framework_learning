package com.bjming.mapper;

import com.bjming.model.Student;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //*********************************************************


    /**
     * 根据主键字段查询学生对象
     */
    Student selectStudentById(@Param("id") Integer id);
}