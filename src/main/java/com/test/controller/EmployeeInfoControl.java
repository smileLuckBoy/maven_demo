package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.test.bean.EmployeeDto;
import com.test.service.EmployeeService;
import com.test.utilty.HttpUtils;

@Controller
@RequestMapping("/emplayee.do")
public class EmployeeInfoControl {

	public final Logger logger = LoggerFactory.getLogger(EmployeeInfoControl.class);

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(params = "method=showEmplayeeInfo")
	public void showEmplayeeInfo(HttpServletRequest request, HttpServletResponse response, EmployeeDto dto) {
		logger.info("start method : {}", "showEmplayeeInfo");
		long id = Long.parseLong("3");
		EmployeeDto employee = employeeService.getEmployeeById(id);

		HttpUtils.writeToPage(response, JSON.toJSONString(employee));
	}
}
