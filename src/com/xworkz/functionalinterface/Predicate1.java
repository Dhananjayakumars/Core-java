package com.xworkz.functionalinterface;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		
		Predicate<Integer> pred=(d)->d/5==0;
		boolean x= pred.test(25);
		System.out.println("The value is "+x );
		
		Predicate<String> str=(h)->h.length()>10;
		
		System.out.println("the value is "+str.test("Predicate"));
		

	}

}
