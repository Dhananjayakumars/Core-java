package com.xworkz.threadConcept;

public class Thread1To50 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread details are "+Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
		
		for(int i=1;i<=50;i++) {
			System.out.println(i);
			
			
		}System.out.println(" End of Thread "+ Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
		
		
	}

}
