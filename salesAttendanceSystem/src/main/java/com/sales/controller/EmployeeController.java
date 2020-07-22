package com.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.dao.RoleDao;
import com.sales.model.Employee;
import com.sales.model.EmployeeDetails;
import com.sales.model.Role;
import com.sales.pwdgenerator.PasswordGenerator;
import com.sales.service.EmployeeDetailService;
import com.sales.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	   @Autowired
	    private EmployeeService employeeService;
	   
	   @Autowired
	    private EmployeeDetailService eDetailService;
   
	   @GetMapping
	   
    public Employee employee() {
		   Employee employee=new Employee();
		   employee.setEmpcode("emp056");
		   employee.setEmpname("smit");
		   employee.setPassword(PasswordGenerator.generatePassword());
    	return employeeService.save(employee); 
    }
	   
	   

	   @GetMapping("/gets")
    public EmployeeDetails employeedetails() {
		  EmployeeDetails employeeDetails =new  EmployeeDetails();
		  employeeDetails.setRole(new Role());
    	employeeDetails.setEmployee(new Employee());
		  return employeeDetails; 
    }
	   
	   @GetMapping("/get")
	   public List<Employee> findall(){
		   return employeeService.findAll();
	   }

    @RequestMapping("/registration")
    @PostMapping
    public EmployeeDetails create(@RequestBody EmployeeDetails employeeDetails) {
        return eDetailService.save(employeeDetails);
    }

    @RequestMapping(value = "/user/{employeecode}")
    @DeleteMapping
    public String delete(@PathVariable(value = "employeecode") String id) {
        employeeService.delete(id);
        return "success";
    }
    

    @RequestMapping("/update")
    @PostMapping
    public Employee update(@RequestBody EmployeeDetails user) {
        return null;//employeeService.updaer(user);
    }
    

	@Autowired
	RoleDao roleDao;
	
	@RequestMapping(value = "/{role}")
	public Role save(@PathVariable(value = "role")String  user) {
		Role role = roleDao.findByRoleId(Integer.parseInt(user));
		return role;
	}

    
    
}
