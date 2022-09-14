package com.sonata.main;

import com.sonata.Model.Employee;
import com.sonata.Impl.EmpImpl;

public class EmpExct {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("sahana");
		e1.setEmplSal(1000);
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));

	}

}
