package com.sonata.impl;

import com.sonata.spring.LoginInterface;
import com.sonata.spring.UserInterface;

public class Login implements LoginInterface {
	UserInterface validateuser;

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setValidateuser(UserInterface validateuser) {
		this.validateuser = validateuser;
	}

	
	
}
