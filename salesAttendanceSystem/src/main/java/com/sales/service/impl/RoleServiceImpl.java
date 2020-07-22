package com.sales.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.RoleDao;
import com.sales.model.Role;
import com.sales.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao roleDao;
	
	@Override
	public List<Role> roleList() {
		List<Role> list = new ArrayList<>();
		roleDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
