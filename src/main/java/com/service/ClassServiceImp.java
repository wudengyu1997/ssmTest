package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Class;
import com.dao.ClassMapper;

@Service
public class ClassServiceImp implements ClassService{

	@Resource(name = "classMapper")
	ClassMapper classMapper;

	@Override
	public List<Class> selClassAll() {
		
		return classMapper.selectAll();
	}
	
	

}
