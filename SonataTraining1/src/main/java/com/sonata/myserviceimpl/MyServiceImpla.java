package com.sonata.myserviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.sonata.myservice.MyServiceIntf;

public class MyServiceImpla {
	private MyServiceIntf myService;
	
	 MyServiceImpla(){}
	 MyServiceImpla (MyServiceIntf mySer){
		this.myService = mySer;
	}
	
	public List<String> retrivalRelated(String user){
		List<String> filteredValue = new ArrayList<String>();
		List<String> allToDo = myService.retrieveUsers(user);
		for(String all : allToDo) {
			if (all.contains("Spring")) {
				filteredValue.add(all);
			}
		}
		return filteredValue;
	}
	
	

	public static void main(String[] args) {
		
	}

}
