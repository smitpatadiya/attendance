package com.sales.service;

import java.util.List;

import com.sales.model.Employee;
import com.sales.model.EmployeeDetails;
import com.sales.model.User;

public interface EmployeeService {
	Employee save(Employee user);
	 List<Employee> findAll();
	void delete(String emp_code);
	
	boolean find(String emp_code);
	
	Employee findbyEmpcode(String empcode);
}
