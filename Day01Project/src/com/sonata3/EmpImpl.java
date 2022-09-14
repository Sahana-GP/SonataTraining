package com.sonata3;

public class EmpImpl extends Employee implements EmpIntf{


	@Override
	public double skillBonus(int subjectUpgraded) {
		
		double sal = 1000;
		//int emplSal =1000;
		switch(subjectUpgraded){  
		  
	    case 1: System.out.println(sal + (sal*0.1));  
	    break;  
	    case 2: System.out.println(sal + (sal*0.2));  
	    break;  
	    case 3: System.out.println(sal + (sal*0.3));  
	    break;  
	   
	    default:System.out.println("default");
			
		}
		return subjectUpgraded;
	}

	@Override
	public void salCal() {
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		EmpImpl em1 = new EmpImpl();
		em1.skillBonus(2);
	}

}
