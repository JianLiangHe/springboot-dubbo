package com.dubbo.service;

import java.util.List;

import com.dubbo.entity.po.Message;

public interface DemoService {

	public List<Message> findMessage();
	
}
