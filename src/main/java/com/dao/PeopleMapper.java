package com.dao;

import java.util.List;

import com.bean.People;

import tk.mybatis.mapper.common.Mapper;

public interface PeopleMapper extends Mapper<People>{
	
	List<People> selectPeopleAll();
    
}