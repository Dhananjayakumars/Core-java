package com.xworkz.ArrayExamples.assignments;

public class HeadPhoneArray {

	public static void main(String[] args) {
		HeadPhone[]HeadPhoneArray=new HeadPhone[4];
		
		HeadPhone boat=new HeadPhone(" boat ",2500,true,0.585);
		boat.displaydetails();
		HeadPhoneArray[0]=boat;
		
		HeadPhone HP=new HeadPhone(" HP ",2000,false,0.526);
		HP.displaydetails();
		HeadPhoneArray[1]=HP;
		
		System.out.println("Using For Loop");
		
		for(int i=0; i<HeadPhoneArray.length ; i++) {
			if(HeadPhoneArray[i] != null) {
				HeadPhone temp = HeadPhoneArray[i];

			temp.displaydetails();
			}
		}
			
			System.out.println("using enhanced for loop");
			for(HeadPhone hp : HeadPhoneArray) {
				if (hp != null)
					hp.displaydetails();
			}
		
		
		

	}

}
