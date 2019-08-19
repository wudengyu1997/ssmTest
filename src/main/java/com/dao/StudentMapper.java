package com.dao;

import java.util.List;

import com.bean.Student;

import tk.mybatis.mapper.common.Mapper;

public interface StudentMapper extends Mapper<Student>{
   
	
		List<Student> selectAllStu(Student student);
}