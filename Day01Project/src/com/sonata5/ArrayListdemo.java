package com.sonata5;

import java.util.ArrayList;

public class ArrayListdemo {

	ArrayList arr = new ArrayList();
	
	public void add(int element) {
		arr.add(element);
	}
	
	public void delete(int element) {
		arr.remove(element);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getSize() {
		// TODO Auto-generated method stub
		return arr.size();
	}

}
