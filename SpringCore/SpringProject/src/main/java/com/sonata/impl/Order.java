package com.sonata.impl;

import com.sonata.spring.LoginInterface;
import com.sonata.spring.OrderInterface;
import com.sonata.spring.UserInterface;

public class Order implements OrderInterface{
	LoginInterface login;
	UserInterface validateuser;

	
	public void setValidateuser(UserInterface validateuser) {
		this.validateuser = validateuser;
	}

	public void setLogin(LoginInterface login) {
		this.login = login;
	}

	@Override
	public boolean placeOrder(String Username, String password, double orderTotal) {
		// TODO Auto-generated method stub
		return false;
	}

}
