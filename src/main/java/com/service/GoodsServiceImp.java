package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Goods;
import com.dao.GoodsMapper;

@Service
public class GoodsServiceImp implements GoodsService{

	@Resource(name = "goodsMapper")
	GoodsMapper goodsMapper;
	
	public int insert(Goods record) {
		goodsMapper.deleteByPrimaryKey(114);
	
		return goodsMapper.insert(record);
	}

}
