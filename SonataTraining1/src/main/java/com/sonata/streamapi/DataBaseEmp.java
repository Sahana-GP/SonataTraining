package com.sonata.streamapi;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {

	public static List<Employee>getEmployee() {
		List<Employee>list = new ArrayList();
		list.add(new Employee(101,"Roshan", "IT",5000));
		list.add(new Employee(102,"Santosh", "CIVIL",9000));
		list.add(new Employee(103,"Bimal", "DEFENCE",4000));
		list.add(new Employee(104,"Prakash", "SOCIAL",7000));
		list.add(new Employee(105,"Shilaja", "Training",6000));
		return list;
	}

}
