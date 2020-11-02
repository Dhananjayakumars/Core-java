package com.xworkz.collections;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) {
		
	ArrayList values=new ArrayList();
	boolean res= values.isEmpty();
	values.add("dhananjay");
	values.add(23);
	values.add(false);
	values.add(25.35);
	
	System.out.println(values);
	System.out.println(values.size());
	System.out.println(res);
	System.out.println(values.contains(23));
	System.out.println(values.remove(25.35));
	System.out.println(values);
	
	

	}

}
