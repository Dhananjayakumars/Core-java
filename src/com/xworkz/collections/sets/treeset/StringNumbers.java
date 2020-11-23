package com.xworkz.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class StringNumbers {

	public static void main(String[] args) {
		
		TreeSet<String> num=new TreeSet<String>();
		num.add("one");
		num.add("two");
		num.add("three");
		num.add("four");
		num.add("five");
		num.add("six");
		num.add("seven");
		num.add("eight");
		num.add("nine");
		num.add("ten");
		
		System.out.println(num);
		System.out.println("==============================");
		
		for(String str: num) {
			System.out.println(str);
		}
		System.out.println("==========================");
		Iterator<String> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================");
	System.out.println(num.floor("fave"));
	System.out.println("==============================");
	System.out.println(num.ceiling("tan"));
	System.out.println("================================");
		System.out.println(num.first());
		System.out.println("===========================");
		System.out.println(num.last());
		System.out.println("==============================");
		num.pollFirst();
		System.out.println(num);
		System.out.println("=============================");
		num.pollLast();
		System.out.println(num);
		
		
		
	}

}
