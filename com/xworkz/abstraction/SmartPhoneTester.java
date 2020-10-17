package com.xworkz.abstraction;

public class SmartPhoneTester {

	public static void main(String[] args) {
	
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.calling();
		smartPhone.messaging();
		smartPhone.camera();
		
		
		Phone phone = new SmartPhone();
		phone.calling();
		phone.music();
		phone.messaging();
		
		

	}

}
