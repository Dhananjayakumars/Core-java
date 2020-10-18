package com.xworkz.inheritance.assignment;

public class WatchTester {

	public static void main(String[] args) {
		
		AnalogWatch aw =new AnalogWatch();
		aw.smart= false;
		aw.Brand="Timex";
		aw.warranty= 2;
		aw.Bandmaterial="Leather";
		aw.price=2000.00;
		aw.display();
		aw.waterproof();
		aw.color();
		
		System.out.println("Brand of the watch is " +aw.Brand);
		System.out.println("Warranty of the watch is "+aw.warranty +"years");
		System.out.println("The watch is madeup of "+aw.Bandmaterial);
		System.out.println("The cost of the watch is "+aw.price);
		
		DigitalWatch dw=new DigitalWatch();
		
		dw.smart= true;
		dw.Brand="Fastrack";
		dw.warranty= 3;
		dw.Bandmaterial="Silicone";
		dw.price=2500.00;
		dw.display();
		dw.waterproof();
		dw.color();
		System.out.println("Brand of the watch is " +dw.Brand);
		System.out.println("Warranty of the watch is "+dw.warranty +"years");
		System.out.println("The watch is madeup of "+dw.Bandmaterial);
		System.out.println("The cost of the watch is "+dw.price);
		
		
		
		

	}

}
