package com.sonata.Model;

public class Employee {

	private int empId;
	private String empName;
	private double emplSal;
	
	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public double getEmplSal() {
		return emplSal;
	}



	public void setEmplSal(double emplSal) {
		this.emplSal = emplSal;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", emplSal=" + emplSal + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
