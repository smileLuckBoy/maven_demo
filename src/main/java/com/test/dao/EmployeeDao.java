package com.test.dao;

import com.test.bean.EmployeeDto;

public interface EmployeeDao {

	int deleteByPrimaryKey(Long id);

    int insert(EmployeeDto record);

    int insertSelective(EmployeeDto record);

    EmployeeDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployeeDto record);

    int updateByPrimaryKey(EmployeeDto record);

}