package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.People;
import com.bean.Student;
import com.common.PrjCommonProperties;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StudentService;

@Controller
public class StudentController {

	@Resource(name = "studentServiceImp")
	StudentService studentService;
	
	
	@RequestMapping(value = "/addstu")
	public String Addview(HttpServletRequest req) {
		return "addstu";
	}
	
	@RequestMapping(value = "/addstusub")
	public String AddStuSub(HttpServletRequest req , Student student) {
		studentService.insertStu(student);	
			return "redirect:selallstu2/1";
	}

	@RequestMapping(value = "/selallstu")
	public String SelAllStu(HttpServletRequest req) {
		List<Student> student = studentService.selectAll();	
		req.setAttribute("student", student);
		return "student";
	}
	
	@RequestMapping(value = "/updatestu")
	public String updateStu(HttpServletRequest req,@RequestParam(value = "id")int id) {
		Student s = studentService.selectById(id);
		req.setAttribute("s", s);
		return "upview2";
	}
	
	@RequestMapping(value = "/updatestu2")
	public String UpdateStu2(HttpServletRequest req,Student student) {
	
		int sw = studentService.updateById(student );
		System.out.println(sw);
		return "redirect:selallstu2/1";
	}
	
	@RequestMapping(value = "/selallstu2/{pageNum}")
	public String SelAllStu2(HttpServletRequest req,@PathVariable(value = "pageNum")int pageNum,Student student) {
		Integer pageSize = PrjCommonProperties.getPageSize();
		PageHelper.startPage(pageNum, pageSize);	
		
		String ss = req.getParameter("sname");
		System.out.println(ss);
		List<Student> s = studentService.selectAllStu(student);
		PageInfo pageinfo = new PageInfo(s);
	
		pageinfo.getNavigatepageNums();


		req.setAttribute("s", s);
		req.setAttribute("pageinfo", pageinfo);
		return "student";
	}
	
	@RequestMapping(value = "/deletebyid")
	public String deleteById(@RequestParam(value = "id")int id,HttpServletRequest req) {
	 studentService.deleteByid(id);

		return "redirect:selallstu2/1";
	}
}
