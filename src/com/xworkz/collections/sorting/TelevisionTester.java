package com.xworkz.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;


public class TelevisionTester {

	public static void main(String[] args) {
		
		Television t1=new Television("MI", 32, "LED");
		Television t2 =new Television("TCL", 42, "LCD");
		Television t3 =new Television("thoshiba", 50, "LED");
		Television t4=new Television("Philips", 24, "CRT");
		
		ArrayList<Television>tele =new ArrayList<Television>();
		tele.add(t1);
		tele.add(t2);
		tele.add(t3);
		tele.add(t4);
		
		for(Television tv:tele) {
			System.out.println(tv);
		}
		
//		Collections.sort(tele,new Sorting());
//		System.out.println(tele);
		
//		Collections.sort(tele, new Sorting());
//		System.out.println(tele);
		
		Collections.sort(tele, new Sorting());
		System.out.println(tele);
		
			
		
		

	}

}
