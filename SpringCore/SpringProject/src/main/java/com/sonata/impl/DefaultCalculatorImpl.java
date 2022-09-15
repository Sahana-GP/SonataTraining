package com.sonata.impl;

import com.sonata.spring.Addition;
import com.sonata.spring.Calculator;

public class DefaultCalculatorImpl implements Calculator {
	Addition add;
	@Override
	public int callAdd(int n1, int n2) {
		return add.add(n1, n2);
	}
	
	public void setAdd(Addition add) {
		this.add = add;
	}
	
	

}
