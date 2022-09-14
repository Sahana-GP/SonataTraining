package com.sonata5;

public class Student implements Comparable<Student>{
int rollno;
String name;
int age;

Student(int rollno, String name, int age){
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}
	

	//@Override
	public int compareTo(Student st) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
