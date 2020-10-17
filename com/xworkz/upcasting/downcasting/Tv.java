package com.xworkz.upcasting.downcasting;

public class Tv {
	
	private int price;
	private String brand;
	private  String Screentype;
	
	public Tv() {
		
	}
	
	public Tv(int inprice,String inbrand,String inscreentype) {
		price=inprice;
		brand=inbrand;
		Screentype=inscreentype;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getScreentype() {
		return Screentype;
	}
	public void setScreentype(String screentype) {
		Screentype = screentype;
	}
	
	  void Playing() {
		 System.out.println("video playing");
		
	}
	  void audio() {
		  System.out.println("Audio playing");
	  }
	
	void Displaydetails() {
		System.out.println("price : "+price+"brand :"+brand+"Screentype : "+Screentype);
	}
	

}
