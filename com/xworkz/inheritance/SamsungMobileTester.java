package com.xworkz.inheritance;

public class SamsungMobileTester {

	public static void main(String[] args) {
	
		SamsungMobile sm=new SamsungMobile();
		sm.brand="samsung";
		System.out.println("The mobile brand is "+sm.brand);
		sm.storage=64.0;
		System.out.println("Storage capity of mobile is " +sm.storage +" GB");
		sm.version=10;
		System.out.println("The version of the mobile is "+sm.version);
		sm.security();
		sm.calling();
		sm.gaming();
		

		
		
		
		

	}

}
