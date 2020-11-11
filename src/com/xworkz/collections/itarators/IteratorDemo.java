package com.xworkz.collections.itarators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (String s: aList) {
	         System.out.println(s);
	      }
	      System.out.println();
	      
	      System.out.println("=================================");
	      Iterator<String>itr= aList.iterator();
	     while (itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     System.out.println();
	     
	     ListIterator<String> itrL= aList.listIterator();
	     while(itrL.hasNext()) {
	    	 System.out.println(itrL.next());
	    	
	     }
	     System.out.println("====================================");
	    while(itrL.hasPrevious()) {
	    	System.out.println(itrL.previous());
	    }
	    	 
		
	    	 
	     
	   
	    
	     
	   
	      

	      
	     
		

		

	}

}
