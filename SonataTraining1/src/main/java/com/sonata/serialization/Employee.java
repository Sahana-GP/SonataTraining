package com.sonata.serialization;

public class Employee implements java.io.Serializable {
	
	private int empID;
	private String empName;
	private transient String empAdd;
	private static double empSal;
	
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}



	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpAdd() {
		return empAdd;
	}



	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}



	public static double getEmpSal() {
		return empSal;
	}



	public static void setEmpSal(double empSal) {
		Employee.empSal = empSal;
	}



	public Employee(int empID, String empName, String empAdd) {
		//super();
		this.empID = empID;
		this.empName = empName;
		this.empAdd = empAdd;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
