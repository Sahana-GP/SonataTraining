package com.sonata.two;

public class TypeCasting {

	public static void main(String[] args) {
		int i = 100;
		double d = i;
        System.out.println("Int value " + i);
        System.out.println("Double value " + d);
        
        char c = 's';
        int x = (int)c;
        System.out.println("char value " + c);
        System.out.println("int value " + x);
        
        int var1 = 5;
        double var2 = 5.65;
        boolean var3 = true;

        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);
        
        //
        Integer obj4 = Integer.valueOf(23);
        Double obj5 = Double.valueOf(5.55);
        Boolean obj6 = Boolean.valueOf(true);

        // converts into primitive types
        int var4 = obj4.intValue();
        double var5 = obj5.doubleValue();
        boolean var6 = obj6.booleanValue();

        // print the primitive values
        System.out.println("The value of int variable: " + var4);
        System.out.println("The value of double variable: " + var5);
        System.out.println("The value of boolean variable: " + var6);
        
 
	}

}
