package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bean.Address;
import com.bean.People;
import com.common.PrjCommonProperties;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.AddressService;
import com.service.PeopleService;

@Controller
public class UserController {

	@Resource(name = "addressServiceImp")
	AddressService addressService;
	
	@Resource(name = "peopleServiceImp")
	PeopleService peopleService;
	
	@RequestMapping(value = "/addview")
	public String Addview(HttpServletRequest req) {
		String addressStr = addressService.getAllAddress();	
		req.setAttribute("addressStr", addressStr);
		
		return "addview";
	}
	

	@RequestMapping(value = "/addviewsub1")
	public String AddviewSub(HttpServletRequest req , People people,MultipartFile imgload) throws Exception, IOException {
		 String filename = imgload.getOriginalFilename();
		 File file=new File(PrjCommonProperties.getUploadpath()+filename);
		
		imgload.transferTo(file);
		
		System.out.println(people.getName()+people.getHobby());
			
			people.setImgpath(filename);
			peopleService.insert(people);
			return "redirect:selview";
	}
	
	@RequestMapping(value = "/upview/{id}")
	public String Upview(HttpServletRequest req,  @PathVariable(value = "id") int id) {
		People people = peopleService.selectById(id);	
		String address = addressService.getAllAddress(people.getAddress());	//获取所有路径的下拉列表
		
		req.setAttribute("hobby", people.getHobby());
		req.setAttribute("people", people);
		req.setAttribute("address", address);
		return "upview1";
	}
	
	@RequestMapping(value = "/upviewSub")
	public String UpviewSub(HttpServletRequest req , People people,MultipartFile imgload) throws Exception, IOException {
		
		if(!imgload.isEmpty()) {
			String filename = imgload.getOriginalFilename();
			File file=new File(PrjCommonProperties.getUploadpath()+filename);
			imgload.transferTo(file);
			people.setImgpath(filename);
		
		}
	
		peopleService.updateById(people);
		return "redirect:selview";
	}
	
	@RequestMapping(value = "/selview/{pagenum}")
	public String Selview(HttpServletRequest req , People people,@PathVariable(value = "paegnum") int paegnum) throws Exception, IOException {
		List<People> peoplelist = peopleService.selectPeopleAll();
		int pageSize=PrjCommonProperties.getPageSize();
		PageHelper.startPage(paegnum, pageSize);
		PageInfo pageinfo=new PageInfo(peoplelist);
		System.out.println(pageinfo);
		req.setAttribute("peoplelist", peoplelist);
		return "selview";
	}
}
