package com.xworkz.functionalinterface;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		
		Supplier<Integer>supplier=()->Integer.parseInt("50");
	System.out.println(supplier.get());	

	}

}
