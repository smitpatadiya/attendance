package com.sales.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sales.model.Employee;
import com.sales.model.Login;
import com.sales.model.Role;

@Repository
public interface LoginDao  extends CrudRepository<Login, String> {
	
	@Transactional
	Login findByEmpcode(Employee i);
	


}
