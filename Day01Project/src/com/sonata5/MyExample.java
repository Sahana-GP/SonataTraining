package com.sonata5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyExample {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("sahana");
		a1.add("sahana");
		a1.add("guitar");
		System.out.println(a1);
		
		LinkedList l1 = new LinkedList(a1);
		l1.addFirst("os");
		l1.addFirst("show");
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
		HashSet h1 = new HashSet(l1);
		h1.add("os");
		h1.add("books");
		System.out.println(h1);
		
		TreeSet t1 = new TreeSet(h1);
		t1.add("os");
		t1.add("msd");
		System.out.println(t1);
		

	}

}
