package com.xworkz.lambdaexpression;

public class OneArgeTester {

	public static void main(String[] args) {
		
		OneArgument d2=(name) -> System.out.println("my name is "+name);
		
		d2.onearge("Dhananjay");
	}
	

}
//output
//my name is Dhananjay