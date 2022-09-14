package com.sonata3;

public class TeamLead extends Employee {
	
	
	@Override
	public void salCal() {
		System.out.println("TL Salary");
	}

	public static void main(String[] args) {
		TeamLead t1 = new TeamLead();
		t1.salCal();

	}

	

}
