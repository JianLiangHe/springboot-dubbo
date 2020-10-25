package com.dubbo.mapper;

import java.util.List;

import com.dubbo.entity.po.Message;

public interface DemoMapper {

	public List<Message> findMessage();
	
}
