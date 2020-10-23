package com.xworkz.annonymous;

public class SandiskPendriveTester {

	public static void main(String[] args) {
		
		SandiskPendrive sandiskPendrive=new SandiskPendrive() {
			
			@Override
			public void design() {
				System.out.println("This pendrive is box shape");
				
			}
			
			@Override
			public void Storage(int gb) {
				System.out.println("This is "+gb +"Gb pendrive");
				
			}
			
			@Override
			public void weight() {
				System.out.println("The pen drive veght is 0.98g");
				
			}
			
			@Override
			public void origin(String country) {
				System.out.println("This os from "+country);
				
			}
		};
		
		sandiskPendrive.design();
		sandiskPendrive.origin("china");
		sandiskPendrive.weight();
		sandiskPendrive.Storage(32);

	}

}
