package com.sonata.Impl;

import com.sonata.Intf.EmpIntf;
import com.sonata.Model.Employee;

public class EmpImpl implements EmpIntf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double yearlySal(Employee e1) {
		double ySal;
		ySal = e1.getEmplSal()*12;
		return ySal;
	}

	@Override
	public double appSal(Employee e1) {
		double aSal;
		if(e1.getEmplSal()<10000) {
			aSal = 5000;
		}else {
			aSal = 1000;
		}
		return aSal;
	}

}
