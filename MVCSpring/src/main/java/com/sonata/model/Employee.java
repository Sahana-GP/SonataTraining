package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="employee")
public class Employee {
	@Id
	private long empid;
	private String empname;
	private double empsal;
	

	

	public long getEmpid() {
		return empid;
	}


	public void setEmpid(long empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public double getEmpsal() {
		return empsal;
	}


	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}


	public Employee(long empid, String empname, double empsal) {
		//super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}


	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}

	
}