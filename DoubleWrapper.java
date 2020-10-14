package com.xworkz.wrapper.classes;

public class DoubleWrapper {

	public static void main(String[] args) {
		
		System.out.println("program starts from here");
		
		double d=25.25;
		
		Double db=new Double(d);// boxing
		System.out.println("The value of db is "+db);
		
		double du=db;// auto boxing
		System.out.println("The value of du is "+du);
		
		double k= Double.valueOf(d);//auto boxing
		System.out.println("The value of k is "+k);
		
		double j= k;
		System.out.println("The value of j is "+j);
		
		

	}

}
