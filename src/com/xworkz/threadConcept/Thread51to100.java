package com.xworkz.threadConcept;

public class Thread51to100 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread details are "+Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
		
		for(int i=51;i<=100;i++) {
			System.out.println(i);
			
		}System.out.println(" End of Thread "+ Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
	}

}
