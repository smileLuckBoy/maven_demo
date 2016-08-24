package com.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.EmployeeDto;
import com.test.dao.EmployeeDao;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	public Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDao employeeDto;

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		logger.info("start method : {} param id : {}","getEmployeeById",id);
		int a = 1;
		int b = a / 0;
		return employeeDto.selectByPrimaryKey(id);
	}
}
