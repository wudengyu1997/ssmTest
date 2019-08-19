package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Class;
import com.service.ClassService;

@Controller
public class ClassController {

	@Resource(name = "classServiceImp")
	ClassService classService;
	
	@RequestMapping(value = "/selclassAll")
	public String SelclassAll(HttpServletRequest req) {
		List<Class> Class = classService.selClassAll();
		req.setAttribute("Class", Class);
		return "class";
	}
}
