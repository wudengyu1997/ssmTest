package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Teacher;
import com.dao.TeacherMapper;

@Service
public class TeacherServiceImp implements TeacherService{

	@Resource(name = "teacherMapper")
	TeacherMapper teacherMapper;
	
	public List<Teacher> selectTeacher() {
		return teacherMapper.selectAll();
	}

}
