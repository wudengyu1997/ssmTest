package com.service;

import java.util.List;


import com.bean.Student;

public interface StudentService {

	int insertStu(Student student); 
	
	List<Student > selectAll();
	
	Student selectById(int id);
	
	 int  updateById(Student student);
	 
	 int  deleteByid(int id);
	 
	 List<Student> selectAllStu(Student student);
}
