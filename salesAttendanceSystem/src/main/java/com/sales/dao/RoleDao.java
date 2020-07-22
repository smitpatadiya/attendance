package com.sales.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sales.model.Role;

@Repository
public interface RoleDao  extends CrudRepository<Role, String> {
	
	@Transactional
	Role findByRole(String i);
	
	@Transactional
	Role findByRoleId(int i);
	
	


}
