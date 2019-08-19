package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.People;
import com.dao.PeopleMapper;

@Service
public class PeopleServiceImp implements PeopleService {

	@Resource(name = "peopleMapper")
	PeopleMapper peopleMapper;
	
	@Override
	public int insert(People record) {
		return peopleMapper.insert(record);
	}

	@Override
	public People selectById(int id) {	
		return peopleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateById(People people) {
		return peopleMapper.updateByPrimaryKeySelective(people);
	}

	@Override
	public List<People>  selectPeopleAll() {
		return peopleMapper.selectPeopleAll();
	}

}
