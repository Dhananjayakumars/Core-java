package com.xworkz.functionalinterface;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		
		Function<String, Integer> function=(str)->Integer.parseInt(str);
		try {
		System.out.println(function.apply("dha"));}
		catch (NumberFormatException e) {
			System.out.println("plz enter string value");
			// TODO: handle exception
		}
		
		
		

	}

}
