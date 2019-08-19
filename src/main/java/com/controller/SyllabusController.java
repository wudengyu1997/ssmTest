package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Syllabus;
import com.service.SyllabusService;

@Controller
public class SyllabusController {

	@Resource(name = "syllabusServiceImp")
	SyllabusService syllabusService;
	
	
	
	@RequestMapping(value = "/selectSyllabus")
	public String SelectSyllabus(HttpServletRequest req) {
		List<Syllabus> syllabus = syllabusService.selectsyllabus();
		req.setAttribute("syllabus", syllabus);
		return "syllabus";
	}

	@RequestMapping(value = "/selectSyllabus2")
	public String SelectSyllabus2(HttpServletRequest req) {
		List<Syllabus> syllabus = syllabusService.selectsyllabus();
		req.setAttribute("syllabus", syllabus);
		return "course";
	}
}
