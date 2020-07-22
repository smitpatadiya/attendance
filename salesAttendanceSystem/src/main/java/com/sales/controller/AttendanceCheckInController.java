package com.sales.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.customexception.SalesExceptionType;
import com.sales.model.Attendance;
import com.sales.model.Employee;
import com.sales.service.AttendaceService;
import com.sales.service.EmployeeService;

@RestController("/attendance")
public class AttendanceCheckInController {

	@Autowired
	AttendaceService service;

	@Autowired
	EmployeeService employeeservice;

	@GetMapping("/sample")
	public Attendance getAttendance() {
		Attendance attendance = new Attendance();
		Employee employee = new Employee();
		employee.setEmpcode("emp056");
		attendance.setEmpcode(employee);
		attendance.setCheckin(1);
		attendance.setCheckintime(new java.util.Date());
		attendance.setCheckouttime(new java.util.Date());
		return attendance;
	}

	@PostMapping("/checkIn")
	public ResponseEntity<Attendance> checkIn(@RequestBody Attendance attendance) {
		if (attendance.getEmpcode()!=null &&attendance.getEmpcode().getEmpcode()!=null && employeeservice.find(attendance.getEmpcode().getEmpcode())) {
			System.out.println(attendance);
			attendance=service.save(attendance);
		}else {
			 return new ResponseEntity(new SalesExceptionType("Failed",HttpStatus.NOT_FOUND.value(), "Please Enter valid Employee code",attendance), HttpStatus.NOT_FOUND);
		}
		 return new ResponseEntity(new SalesExceptionType("Success",HttpStatus.OK.value(), "Operation Perform successfully",attendance), HttpStatus.OK);
	}

	@PostMapping("/checkout")
	public ResponseEntity checkOut(@RequestBody Attendance attendance) {
		if (attendance.getEmpcode()!=null &&attendance.getEmpcode().getEmpcode()!=null && employeeservice.find(attendance.getEmpcode().getEmpcode())) {
			System.out.println(attendance);
			attendance=service.save(attendance);
		}else {
			 return new ResponseEntity(new SalesExceptionType("Failed",HttpStatus.NOT_FOUND.value(), "Please Enter valid Employee code",attendance), HttpStatus.NOT_FOUND);
		}
		 return new ResponseEntity(new SalesExceptionType("Success",HttpStatus.OK.value(), "Operation Perform successfully",attendance), HttpStatus.OK);
	}
}
