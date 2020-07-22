package com.sales.service;

import java.util.List;

import com.sales.model.Role;

public interface RoleService {
	
	List<Role> roleList();
	
	Role findById(int id);

}
