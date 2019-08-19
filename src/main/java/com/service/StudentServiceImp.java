package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bean.Student;
import com.dao.StudentMapper;

@Service
public class StudentServiceImp implements StudentService{

	@Resource(name = "studentMapper")
	StudentMapper studentMapper;
	
	public List<Student> selectAll() {
		return studentMapper.selectAll();
	}

	@Override
	public int updateById(Student student) {
		
		return studentMapper.updateByPrimaryKeySelective(student);
	}

	@Override
	public Student selectById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertStu(Student student) {
		return studentMapper.insert(student);
	}

	@Override
	public int  deleteByid(int id) {
		return studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Student> selectAllStu(Student student) {
		student.setSname("%"+student.getSname()+"%");
		return studentMapper.selectAllStu(student);
	}

	

}
