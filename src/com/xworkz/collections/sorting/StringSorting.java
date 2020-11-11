package com.xworkz.collections.sorting;

import java.util.ArrayList;

import java.util.Collections;

public class StringSorting {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> stringsort=new ArrayList<String>();
		stringsort.add("red");
		stringsort.add("blue");
		stringsort.add("yellow");
		stringsort.add("vilot");
		stringsort.add("green");
		stringsort.add("white");
		stringsort.add("orange");
		stringsort.add("skyblue");
		stringsort.add("grey");
		
		System.out.println(stringsort);
		Collections.sort(stringsort);
		System.out.println(stringsort);
		
		Collections.reverse(stringsort);
		System.out.println(stringsort);
		
		
		
	}

}
