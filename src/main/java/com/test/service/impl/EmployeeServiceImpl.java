package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.EmployeeDto;
import com.test.dao.EmployeeDao;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDto;

	public EmployeeDto getEmployeeById(Long id) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>我进service了");
		return employeeDto.selectByPrimaryKey(id);
	}
}
