package com.xworkz.threadConcept;

public class MainThread {

	public static void main(String[] args) {
	
		ThreadHello threadHello= new ThreadHello();
		Thread t1=new Thread(threadHello);
		t1.start();
		ThreadWelcome threadWelcome=new ThreadWelcome();
		Thread t2=new Thread(threadWelcome);
		t2.start();

	}

}
//output
//Thread details are Thread-0and10
//Hello
//Hello
//Hello
//Hello
//Hello
// End of Thread Thread-0and10
//Thread details are Thread-1and11
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
//Welcome
// End of Thread Thread-1and11