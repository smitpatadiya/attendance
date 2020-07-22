package com.sales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.AttendanceDao;
import com.sales.dao.EmployeeDao;
import com.sales.model.Attendance;
import com.sales.model.Employee;
import com.sales.service.AttendaceService;

@Service
public class AttendanceCheckInServiceImpl implements AttendaceService {
	@Autowired
	AttendanceDao dao;
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Attendance save(Attendance user) {
		Employee emp = employeeDao.findByEmpcode(user.getEmpcode().getEmpcode());
		user.setEmpcode(emp);
		return dao.save(user);
	}

}
