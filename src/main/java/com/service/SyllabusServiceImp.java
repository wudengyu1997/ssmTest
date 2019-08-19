package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Syllabus;
import com.dao.SyllabusMapper;

@Service
public class SyllabusServiceImp implements SyllabusService{

	@Resource(name = "syllabusMapper") 
		SyllabusMapper syllabusMapper;
	
	public List<Syllabus> selectsyllabus() {
		
		return syllabusMapper.selectAll();
	}

}
