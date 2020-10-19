package com.xworkz.interfaces.fan;

public class BajajFan implements UshaFan {

	@Override
	public void Aircirculation() {
		System.out.println("circulating fresh air...");
		
	}

	@Override
	public void prevention() {
		System.out.println(" prevention of harmful gases and fumes");
		
	}

	@Override
	public void Revolution() {
		System.out.println("revoluting at 4500 RPM");
		
	}

	@Override
	public void control() {
		System.out.println("controling with remote....");
		
	}

}
