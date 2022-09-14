package com.sonata.main;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.emodel.Employee;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(35);
		e1.setEmpname("Roopa");
		e1.setEmpsal(456);
		
		
		EmployeeImpl p1 = new EmployeeImpl();
		int a1 = p1.save(e1);
		System.out.println(a1);
		
	}

}
