package com.xworkz.collections.itarators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SetTopBoxTester {

	public static void main(String[] args) {
		
		SetTopBox stb1=new SetTopBox("tataSky", 1699, true);
		SetTopBox stb2=new SetTopBox("Airtel", 2000, false);
		SetTopBox stb3 =new SetTopBox("videocon", 2500, true);
		SetTopBox stb4 =new SetTopBox("sundirect", 1699, false);
		
		ArrayList<SetTopBox>stb=new ArrayList<SetTopBox>();
		stb.add(stb1);
		stb.add(stb2);
		stb.add(stb3);
		stb.add(stb4);
		
		System.out.println(stb);
		System.out.println("===========================");
		System.out.println("using enhanced for loop");
		
		for(SetTopBox setbox:stb)
		System.out.println(setbox);
		
		System.out.println("====================");
		System.out.println("Using Iterators");
		
		
		Iterator<SetTopBox> Bitr= stb.iterator();
		while(Bitr.hasNext()) {
			SetTopBox box=Bitr.next();
				System.out.println(box);
		}
				
				System.out.println("====================");
				System.out.println("Using ListIterators");
		
		ListIterator<SetTopBox>Litr=stb.listIterator();
		while(Litr.hasNext()) {
				System.out.println(Litr.next());
		}
		System.out.println("================================");
		while(Litr.hasPrevious()) {
			System.out.println(Litr.previous());
		
				
			
		}
		
		
		
	}

	}


