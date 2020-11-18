package com.xworkz.collections.sets;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class StringLinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet<String>weekdays=new LinkedHashSet<String>();
		weekdays.add("sun");
		weekdays.add("mon");
		weekdays.add("tue");
		weekdays.add("wed");
		weekdays.add("thu");
		weekdays.add("fri");
		weekdays.add("sat");
		
		
		for(String shs:weekdays) {
			System.out.println(shs);
		}
	System.out.println("====================================");
		
		Iterator<String> sl=weekdays.iterator();
		while(sl.hasNext()) {
			System.out.println(sl.next());
		}

	}



}
