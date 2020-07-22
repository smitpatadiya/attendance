package com.sales.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sales.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, String> {
	@Transactional
	Employee findByEmpcode(String emp_code);
	
	@Transactional
	void deleteByEmpcode(String emp_code);
	



}
