package com.xworkz.collections.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EarphoneTreeTester {

	public static void main(String[] args) {
		
		Comparator<EarphoneTreeset>price=(o1,o2)->o1.getPrice()-o2.getPrice();
	EarphoneTreeset et1=new EarphoneTreeset("boat", 560, false);
	EarphoneTreeset et2=new EarphoneTreeset("samsung", 600, true);
	EarphoneTreeset et3=new EarphoneTreeset("jbl", 1000, false);
	
	TreeSet<EarphoneTreeset>earphone=new TreeSet<EarphoneTreeset>(price);
	earphone.add(et1);
	earphone.add(et2);
	earphone.add(et3);
	
	System.out.println(earphone);
	System.out.println("====================================");
	
	earphone.forEach((a)->System.out.println(a));
	System.out.println("=======================");
	
	Iterator<EarphoneTreeset>itr=earphone.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("======================================");
    System.out.println(earphone.floor(et1));
    System.out.println("=================================");
	System.out.println(earphone.ceiling(et2));
	System.out.println("==========================");
	System.out.println(earphone.first());
	System.out.println("===============================");
	System.out.println(earphone.last());
	System.out.println("===================================");
	earphone.pollFirst();
	System.out.println(earphone);
	
	System.out.println("===================================");
	earphone.pollLast();
	System.out.println(earphone);
	
	
	
	}

}
