package com.xworkz.upcasting.downcasting;

public class RealmeTvTester {

	public static void main(String[] args) {
		
		Tv tv=new RealmeTv();//upcasting
		tv.audio();
		tv.Playing();
		tv.setPrice(20000);
		tv.setBrand("realme");
		tv.setScreentype("LED");
		tv.Displaydetails();
		
		RealmeTv realme=(RealmeTv) new Tv();//downcasting
		realme.Playing();
		tv.Displaydetails();
		tv.audio();
		
		
		///throwing an exception here
		
		

	}

}
