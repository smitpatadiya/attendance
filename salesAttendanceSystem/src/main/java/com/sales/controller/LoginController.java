package com.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.customexception.SalesExceptionType;
import com.sales.model.Employee;
import com.sales.model.Login;
import com.sales.service.EmployeeService;
import com.sales.service.LoginService;

@RestController("/login")
public class LoginController {
	@Autowired
	EmployeeService employeeservice;
	
	@Autowired
	LoginService loginService;
	
	
	
	@GetMapping("/samples")
	public <T> ResponseEntity<T> getsampledata(){
		Login login=new Login();
		login.setAppversion("1.0");
		login.setAppversioncode("001");
		Employee empcode =new Employee();
		empcode.setEmpcode("emp056");
		login.setEmpcode(empcode);
		 return new ResponseEntity(new SalesExceptionType("Success", HttpStatus.NOT_FOUND.value(),
				"Operation Perform successfully", login), HttpStatus.OK);
		
	}

	@PostMapping("/login")
	public <T> ResponseEntity<T> login(@RequestBody Login details) {
		if (details.getEmpcode() != null && details.getEmpcode().getEmpcode() != null
				) {
		Employee employee=	employeeservice.findbyEmpcode(details.getEmpcode().getEmpcode());
			System.out.println(details);
			if(employee!=null) {
				double version=!details.getAppversion().isEmpty()?Double.parseDouble(details.getAppversion()):0;
				details.setEmpcode(employee);
			    details = loginService.save(details);
				System.out.println(details.getAppversion());
				if(!(version>=Double.parseDouble(details.getAppversion()))){
					return new ResponseEntity(new SalesExceptionType("Failed", HttpStatus.CONFLICT.value(),
							"Please upgrade your app version", details), HttpStatus.NOT_FOUND);
				}
			}
			
		} else {
			return new ResponseEntity(new SalesExceptionType("Failed", HttpStatus.OK.value(),
					"Please Enter valid Employee code", details), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(new SalesExceptionType("Success", HttpStatus.OK.value(),
				"Operation Perform successfully", details), HttpStatus.OK);
	}

}
