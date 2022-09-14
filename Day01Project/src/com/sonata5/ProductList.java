package com.sonata5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductList {

	public static void main(String[] args) {
		LinkedList<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(123, "TV", 789));
		p1.add(new Product(124, "Mobile", 785));
		p1.add(new Product(125, "Laptop", 895));
		
		for(Product p2:p1) {
			System.out.println(p2.pID+" " + p2.pName + " " + p2.pPrice);
		}
		System.out.println("");
		LinkedList<String> l1 = new LinkedList<String>();
		int b=10;
		
		
		l1.add("This is a");
		l1.add("Linked");
		l1.add("List");
		l1.add("Program");
		//l1.add("");

		System.out.println(l1);
		System.out.println("");
		
		Iterator<String> i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}
