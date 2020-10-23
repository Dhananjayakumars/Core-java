package com.xworkz.lambdaexpression;

public class MultiArgeTester {

	public static void main(String[] args) {
		
		MultiArge d3=(name,age,work)->System.out.println("My name is "+name+" I'm "+age+" years old and working at "+work);
		
		d3.multiarge("Dhananjay", 23, "Xworkz");

	}

}

//output
//My name is Dhananjay I'm 23 years old and working at Xworkz