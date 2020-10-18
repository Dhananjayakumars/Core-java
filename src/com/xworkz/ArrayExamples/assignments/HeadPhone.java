package com.xworkz.ArrayExamples.assignments;

public class HeadPhone {
	String brand;
	int price;
	boolean bluetooth;
	double weight;
	
	
	public  HeadPhone(String inbrand , int inprice , boolean inbluetooth,double inweight) {
		brand=inbrand;
		price=inprice;
		bluetooth= inbluetooth;
		weight=inweight;
	}
	
	void displaydetails() {
		System.out.println("brand : "+brand+" price : "+price +" bluetooth "+bluetooth +" weight "+weight);
	}
	

}
