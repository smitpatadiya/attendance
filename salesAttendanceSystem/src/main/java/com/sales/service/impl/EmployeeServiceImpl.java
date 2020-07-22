package com.sales.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.EmployeeDao;
import com.sales.dao.EmployeeDetailDao;
import com.sales.model.Employee;
import com.sales.model.EmployeeDetails;
import com.sales.service.EmployeeService;

import ch.qos.logback.classic.net.SyslogAppender;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	private EmployeeDetailDao employeedetailDao;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		  List<Employee> list = new ArrayList<>();
		//  System.out.println(employeeDao.findOne(12l));
	        employeeDao.findAll().iterator().forEachRemaining(list::add);
	        return list;
	}

	@Override
	public void delete(String emp_code) {
		Employee emp=employeeDao.findByEmpcode(emp_code);
	    // System.out.println(emp.getDetails());
	     
		employeeDao.deleteByEmpcode(emp_code);

	}

	@Override
	public boolean find(String emp_code) {
		// TODO Auto-generated method stub
		Employee emp=employeeDao.findByEmpcode(emp_code);
		
		return emp!=null && emp.getEmpcode()!=null && !emp.getEmpcode().isEmpty() ?true :false;	
		}

	@Override
	public Employee findbyEmpcode(String empcode) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmpcode(empcode);
	}

}
