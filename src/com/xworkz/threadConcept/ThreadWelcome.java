package com.xworkz.threadConcept;

public class ThreadWelcome implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread details are "+Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
		for(int i=1;i<=10;i++) {
			System.out.println("Welcome");
	}
		System.out.println(" End of Thread "+ Thread.currentThread().getName()+"and"
				+Thread.currentThread().getId());
	}

}
