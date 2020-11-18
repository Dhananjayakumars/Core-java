package com.xworkz.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String>linklist=new LinkedList<String>();
		linklist.add("RCB");
		linklist.add("MI");
		linklist.add("CSK");
		linklist.add("DC");
		linklist.add("RR");
		linklist.add("KX11P");
		linklist.add("SRH");
		linklist.add("KKR");
		
		
		
		System.out.println(linklist);
		
		System.out.println("===================================");
		
		Iterator<String>sll=linklist.iterator();
		while(sll.hasNext()) {
			System.out.println(sll.next());
		}
		System.out.println("==========================");
		
		ListIterator<String>sli=linklist.listIterator();
		while(sli.hasNext()) {
			System.out.println(sli.next());
		}
		System.out.println("=================================");
		while(sli.hasPrevious()){
			System.out.println(sli.previous());
		}
		
		System.out.println("Displaying 1st element: "+linklist.peek());
		System.out.println("--------------------------");
		System.out.println("Displaying 1st element: "+linklist.getFirst());
		System.out.println("--------------------------");
		System.out.println("Displaying last element: "+linklist.getLast());
		System.out.println("--------------------------");
		System.out.println("Displaying 1st element: "+linklist.element());
		
		System.out.println("=======================================");
		
		
		System.out.println(linklist.remove());
		System.out.println("--------------------------");
		System.out.println(linklist.poll());
		System.out.println("--------------------------");
		System.out.println(linklist.pollFirst());
		System.out.println("--------------------------");
		System.out.println(linklist.pollLast());
		System.out.println("--------------------------");
		System.out.println(linklist.pop());
		System.out.println("--------------------------");
		linklist.push("PW");
		System.out.println(linklist);
		System.out.println("--------------------------");
		linklist.removeAll(linklist);
		System.out.println(linklist);
		

	}

}
