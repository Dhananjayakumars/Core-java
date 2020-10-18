package com.xworkz.inheritance.assignment;

public class BikeTester {

	public static void main(String[] args) {
		HondaActiva obj =new HondaActiva ();
		obj.seater=2;
		System.out.println("no of seat is "+obj.seater);
		obj.speed=90;
		System.out.println("The max speed of bike is "+obj.speed +"kmph");
		obj.price=80000;
		obj.fuelcapacity=8;
		obj.model();
		obj.start();
		
		
		
		
		
		
		

	}

}
