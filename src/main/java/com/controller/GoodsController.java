package com.controller;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Goods;
import com.service.GoodsService;

@Controller
public class GoodsController {

	@Resource(name = "goodsServiceImp")
	GoodsService goodsservice;
	
	@RequestMapping(value = "/insert")
	public String insert(Goods record) {
		
//		ApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 goodsservice = (GoodsService) cp.getBean("goodsServiceImp");
		goodsservice.insert(record);
		return "forward:index.jsp";
	}
	
//	public static void main(String[] args) {
//		Goods record=new Goods();
//		record.setGoodsname("xiaopopo");
//		record.setMyorderid(2);
//		new GoodsController().insert(record);
//	}
}
