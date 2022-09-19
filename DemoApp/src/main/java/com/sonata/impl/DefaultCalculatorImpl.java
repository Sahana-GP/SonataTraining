package com.sonata.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sonata.spring.Addition;
import com.sonata.spring.Calculator;



@Component
public class DefaultCalculatorImpl implements Calculator {
	@Autowired
	Addition defaultAdditionImpl;
	
	@Override
	public int callAdd(int n1, int n2) {
		return defaultAdditionImpl.add(n1, n2);
	}
	
	public void setAdd(Addition add) {
		this.defaultAdditionImpl = add;
	}
	
	

}