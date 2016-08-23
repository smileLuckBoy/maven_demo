package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.test.bean.EmployeeDto;
import com.test.service.EmployeeService;
import com.test.utilty.HttpUtils;

@Controller
@RequestMapping("/emplayee.do")
public class EmployeeInfoControl {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(params = "method=showEmplayeeInfo")
	public void showEmplayeeInfo(HttpServletRequest request, HttpServletResponse response, EmployeeDto dto) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>我进controller了");
		long id = Long.parseLong("3");
		EmployeeDto employee = employeeService.getEmployeeById(id);
		
		HttpUtils.writeToPage(response, JSONObject.toJSONString(employee));

	}
}
