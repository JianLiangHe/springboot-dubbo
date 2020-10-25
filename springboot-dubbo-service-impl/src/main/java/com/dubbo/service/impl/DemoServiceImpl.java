package com.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.entity.po.Message;
import com.dubbo.mapper.DemoMapper;
import com.dubbo.service.DemoService;

@Service(timeout = 15000)
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	@Override
	public List<Message> findMessage() {
		// TODO Auto-generated method stub
		return demoMapper.findMessage();
	}

}
