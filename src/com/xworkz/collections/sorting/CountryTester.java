package com.xworkz.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {

	public static void main(String[] args) {
		
		Country c1=new Country(28, "india", 91);
		Country c2=new Country(50, "usa", 1);
		Country c3=new Country(7, "nepal", 977);
		Country c4=new Country(20, "Bangladesh", 880);
		Country c5=new Country(6, "srilanka", 94);
		
		ArrayList<Country> cnty =new ArrayList<Country>();
		cnty.add(c1);
		cnty.add(c2);
		cnty.add(c3);
		cnty.add(c4);
		cnty.add(c5);
		
		for(Country cnt:cnty) {
			System.out.println(cnt);
		}
		Collections.sort(cnty);
		System.out.println(cnty);
		
		Collections.reverse(cnty);
		System.out.println(cnty);
		

	}

}
