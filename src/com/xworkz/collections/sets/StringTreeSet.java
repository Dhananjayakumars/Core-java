package com.xworkz.collections.sets;

import java.util.Iterator;

import java.util.TreeSet;

public class StringTreeSet {
public static void main(String[] args) {
		
		TreeSet<String>weekdays=new TreeSet<String>();
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
