package com.xworkz.collections.sorting;

import java.util.Comparator;

public class Sorting implements Comparator<Television>{

	@Override
	public int compare(Television o1, Television o2) {
		
//		return o1.getInches()-o2.getInches();
//		return o2.getBrand().compareTo(o1.getBrand());
		return o2.getType().compareTo(o1.getType());
	}

	

}
