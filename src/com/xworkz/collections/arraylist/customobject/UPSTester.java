package com.xworkz.collections.arraylist.customobject;

import java.util.ArrayList;

public class UPSTester {

	public static void main(String[] args) {
		
		UPS u1=new UPS("Zebranics", 1600, 600);
		UPS u2 =new UPS("vguard", 1900, 650);
		UPS u3 =new UPS("Microtek", 2000, 700);
		UPS u4 =new UPS("Luminus",2500, 650);
		UPS u5=new UPS("iBall", 2500, 800);
		UPS u6=new UPS ("atris",2600,650);
		
		ArrayList<UPS> ups=new ArrayList<UPS>();
		 ups.add(u1);
		 ups.add(u2);
		 ups.add(u3);
		 ups.add(u4);
		 
		 System.out.println(ups);
		 
		 System.out.println();
		 
		 System.out.println("===========================");
		 
		System.out.println("using enhanced for loop");
		for(UPS up:ups)
		System.out.println(up);
		System.out.println();
		
		System.out.println("====================");
		System.out.println("using For Each loop");
		
		
		ups.forEach((n)->System.out.println(n));
		System.out.println();
		
		System.out.println("display last element");
		
		System.out.println(ups.get(ups.size()-1));
		
		System.out.println("upate 3 element");
		
		ups.set(3, u5);
		System.out.println(ups);
		ups.add(0, u6);
		System.out.println(ups);
		

	}

}
