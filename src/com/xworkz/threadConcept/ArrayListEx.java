package com.xworkz.threadConcept;

import java.util.ArrayList;

public class ArrayListEx extends Thread{
	@Override
	public void run() {
		   System.out.println("Thread details :"+Thread.currentThread().getName());
		ArrayList<String>names=new ArrayList<String>();
		names.add("dhananjay");
		names.add("krishna");
		names.add("subhash");
		names.add("chandan");
		
		names.forEach((a)->System.out.println(a));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("Thread end details :"+Thread.currentThread().getName());
		
		
	}

}
