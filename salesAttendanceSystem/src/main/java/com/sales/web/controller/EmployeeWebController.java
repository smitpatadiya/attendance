package com.sales.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sales.model.Employee;
import com.sales.model.Role;
import com.sales.pwdgenerator.PasswordGenerator;
import com.sales.service.EmployeeDetailService;
import com.sales.service.EmployeeService;
import com.sales.service.RoleService;

@Controller
public class EmployeeWebController {

	@Autowired
	RoleService roleService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeDetailService eDetailService;

	
	
	
	@GetMapping("admin")
	public ModelAndView get(ModelAndView andView) {
		List<Role> role = roleService.roleList();
		System.out.println(role);
		andView.addObject("roledetail", role);
		Employee employee=new Employee();
		employee.setRole(role.get(0));
		andView.addObject("employee", employee);
		andView.setViewName("Login");
		return andView;
	}

	@PostMapping("generate")
	public ModelAndView generateUser(@ModelAttribute Employee employee, BindingResult result) {
		ModelAndView modelAndView =new ModelAndView("index");
		System.out.println(employee);
		employee.setEmpcode( "001");
		employee.setEmpname("smit");
		employee.setPassword(PasswordGenerator.generatePassword());
		modelAndView.addObject("username", employee.getEmpcode());
		modelAndView.addObject("password", employee.getPassword());
		employeeService.save(employee);
		return modelAndView;

	}

	@GetMapping("reg")
	public ModelAndView reg(ModelAndView andView) {
		List<Role> role = roleService.roleList();
		System.out.println(role);
		andView.addObject("role", role);
		andView.setViewName("registration");
		return andView;
	}

	@GetMapping("home")
	public ModelAndView home(ModelAndView andView) {
		List<Role> role = roleService.roleList();
		System.out.println(role);
		andView.addObject("role", role);
		andView.setViewName("home");
		return andView;
	}
}
