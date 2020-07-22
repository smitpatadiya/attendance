package com.sales.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sales.model.Employee;
import com.sales.model.EmployeeDetails;

@Repository
public interface EmployeeDetailDao extends CrudRepository<EmployeeDetails, String> {
/*
	@Modifying
	@Transactional
	@Query("delete from EmployeeDetails e where e.empcode=:emp_code")
	void deleteByEmpcode(@Param("emp_code") String emp_code);*/
	
/*	@Modifying
	@Transactional
	@Query("select e from EmployeeDetails e where e.empployee.empcode=:emp_code")
	EmployeeDetails findByEmpployee(@Param("emp_code")String emp_code);
*/

}
