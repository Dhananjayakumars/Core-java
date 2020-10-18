package com.xworkz.interfaces;

public class LatheMachine implements Machine {

	@Override
	public void Rotating() {
		System.out.println("The Shaft is rotating at 1500 RPM");
		
	}

	@Override
	public void Shiftgear() {
		System.out.println("Lathe machine having an auto shifting gear");
	}

	@Override
	public void Operation() {
		System.out.println("The whole operations are manual operation");
		
	}
	
	
	

}
