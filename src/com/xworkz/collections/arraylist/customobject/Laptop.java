package com.xworkz.collections.arraylist.customobject;


public class Laptop {
	
	private String brand;
	private int price;
	private double ram;
	
	
	
	public Laptop(String brand, int price, double ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	
	
	
		

	
	
}
