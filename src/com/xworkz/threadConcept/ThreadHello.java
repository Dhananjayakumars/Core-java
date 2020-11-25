package com.xworkz.threadConcept;

public class ThreadHello implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread details are "+Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println(" End of Thread "+ Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
	}
	
	

}
