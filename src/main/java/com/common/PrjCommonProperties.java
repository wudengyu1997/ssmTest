package com.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrjCommonProperties {
	
	
	private static String uploadpath;//文件上传路径
	private static Integer pageSize;
	
	

	public static Integer getPageSize() {
		return pageSize;
	}

	@Value("${pageSize}" )
	public  void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
	}

	public static String getUploadpath() {
		return uploadpath;
	}
	
	@Value("${uploadpath}" )
	public void setUploadpath(String uploadpath) {	
		this.uploadpath = uploadpath;
	}
	
	
}
