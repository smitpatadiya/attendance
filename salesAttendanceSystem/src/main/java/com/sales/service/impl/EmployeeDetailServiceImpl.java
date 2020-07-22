package com.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.EmployeeDao;
import com.sales.dao.EmployeeDetailDao;
import com.sales.dao.RoleDao;
import com.sales.model.Employee;
import com.sales.model.EmployeeDetails;
import com.sales.model.Role;
import com.sales.service.EmployeeDetailService;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {
	@Autowired
	EmployeeDetailDao detailDao;

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	RoleDao roleDao;

	@Override
	public EmployeeDetails save(EmployeeDetails user) {
		Employee emp = employeeDao.findByEmpcode(user.getEmployee().getEmpcode());
		user.setEmployee(emp);
		Role role = roleDao.findByRole(user.getRole().getRole());
		user.setRole(role);
		return detailDao.save(user);
	}

	@Override
	public List<EmployeeDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String emp_code) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean find(String emp_code) {
		// TODO Auto-generated method stub
		return false;
	}

}
