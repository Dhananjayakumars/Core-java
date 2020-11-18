package com.xworkz.collections.linkedlist.customlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HotelTester {

	public static void main(String[] args) {
		
		Hotel hotel1=new Hotel("prestige", 5, 3.0);
		Hotel hotel2=new Hotel("kanchana", 9, 4.0);
		Hotel hotel3=new Hotel("padma", 10, 4.5);
		Hotel hotel4=new Hotel("janatha", 8, 4.7);
		
		LinkedList<Hotel> hotel=new LinkedList<Hotel>();
		hotel.add(hotel1);
		hotel.add(hotel2);
		hotel.add(hotel3);
		hotel.add(hotel4);
		
		for(Hotel hotLL:hotel)
		System.out.println(hotLL);
		System.out.println("=====================================");
		
		Iterator<Hotel>hotI=hotel.iterator();
		while(hotI.hasNext()) {
			System.out.println(hotI.next());
		}
		System.out.println("===========================================");
		ListIterator<Hotel>hotLI=hotel.listIterator();
		while(hotLI.hasNext()) {
			System.out.println(hotLI.next());
		}
		System.out.println("=========================================");
		
		System.out.println(hotel.poll());
		System.out.println("=========================================");
		System.out.println(hotel.pollFirst());
		System.out.println("=========================================");
		System.out.println(hotel.pollLast());
		System.out.println("=========================================");
		System.out.println(hotel.pop());
		System.out.println("=========================================");
		
		hotel.push(hotel4);
		System.out.println(hotel);
	}

}
