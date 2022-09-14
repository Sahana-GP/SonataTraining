package com.sonata.myservice;

import java.util.List;

import java.util.Arrays;

public class MyServiceStub implements MyServiceIntf{

	@Override
	public List<String> retrieveUsers(String user){
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
