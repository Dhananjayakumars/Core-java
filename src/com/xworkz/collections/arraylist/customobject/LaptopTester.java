package com.xworkz.collections.arraylist.customobject;

import java.util.ArrayList;

public class LaptopTester {

	public static void main(String[] args) {
		
		Laptop laptop1=new Laptop("Dell", 25000, 4.0);
		Laptop laptop2=new Laptop("HP", 30000, 8.0);
		Laptop laptop3=new Laptop("sony", 26000, 6.0);
		Laptop laptop4=new Laptop("Lenovo", 36000, 12.0);
		Laptop laptop5=new Laptop("Thoshiba", 40000, 6.0);
		Laptop laptop6=new Laptop("LG", 50000, 16.0);
		
		ArrayList<Laptop> lapAL =new ArrayList<Laptop>();
		lapAL.add(laptop1);
		lapAL.add(laptop2);
		lapAL.add(laptop3);
		lapAL.add(laptop4);
		System.out.println(lapAL);
		
		for(Laptop lap:lapAL) {
			System.out.println(lap);
			
		}
		System.out.println("===================================");
		System.out.println(lapAL.get(lapAL.size() - 1));
		System.out.println("=======================================");
		
		lapAL.set(2, laptop5);
		System.out.println(lapAL);
		System.out.println("=============================================");
		
		lapAL.add(0, laptop6);
		System.out.println(lapAL);
		
		
		
		

	}

}
