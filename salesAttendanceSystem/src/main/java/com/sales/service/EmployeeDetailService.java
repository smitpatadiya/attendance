package com.sales.service;

import java.util.List;

import com.sales.model.EmployeeDetails;

public interface EmployeeDetailService {

	EmployeeDetails save(EmployeeDetails user);
	 List<EmployeeDetails> findAll();
	void delete(String emp_code);
	
	boolean find(String emp_code);
	
}
