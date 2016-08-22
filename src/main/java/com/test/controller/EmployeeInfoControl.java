package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.test.bean.Employee;
import com.test.utilty.HttpUtils;

@Controller
@RequestMapping("/emplayee.do")
public class EmployeeInfoControl {
	@RequestMapping(params = "method=showEmplayeeInfo")
	public void showEmplayeeInfo(HttpServletRequest request, HttpServletResponse response, Employee dto) {
		Employee retDto = new Employee();
		retDto.setName("张三");
		retDto.setAge(110);
		retDto.setNation("汉");
		retDto.setSalary(10000.00);
		
		HttpUtils.writeToPage(response, JSONObject.toJSONString(dto));

	}
}
