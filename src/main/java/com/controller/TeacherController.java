package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Teacher;
import com.service.TeacherService;

@Controller
public class TeacherController {

	@Resource(name = "teacherServiceImp")
	TeacherService teacherService;
	
	@RequestMapping(value = "/selectTeacherAll")
	public String SelectTeacherAll(HttpServletRequest req) {
		List<Teacher> teacher = teacherService.selectTeacher();
		req.setAttribute("teacher", teacher);
		return "teacher";
	}
}
