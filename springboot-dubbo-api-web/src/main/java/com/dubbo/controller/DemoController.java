package com.dubbo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.po.Message;
import com.dubbo.entity.vo.ApiResponse;
import com.dubbo.service.DemoService;

@RestController
public class DemoController {

	@Reference
	private DemoService demoService;
	
	@RequestMapping(value ="/query")
	public ApiResponse demo() {
		 try {
			 List<Message> messageList = demoService.findMessage();
			 return new ApiResponse(200, "success", messageList);
		 } catch (Exception e) {
			 e.printStackTrace();
	         return new ApiResponse(500, "系统异常", null);
		 }
	}
	
}
