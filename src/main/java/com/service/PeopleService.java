package com.service;

import java.util.List;

import com.bean.People;

public interface PeopleService {
	  int insert(People record);
	  
	  People selectById(int id);
	  
	 int  updateById(People people);
	 
	 List<People>  selectPeopleAll();
}
