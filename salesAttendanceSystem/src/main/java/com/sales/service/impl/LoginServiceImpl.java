package com.sales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.LoginDao;
import com.sales.model.Login;
import com.sales.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public Login save(Login login) {
		Login ln=loginDao.findByEmpcode(login.getEmpcode());
		if(ln==null) {
		return loginDao.save(login);
		}else if((Double.parseDouble(ln.getAppversion())<=Double.parseDouble(login.getAppversion()))){
	    login.setId(ln.getId());
		return loginDao.save(login);
		}
		
	   return ln;
	}

}
