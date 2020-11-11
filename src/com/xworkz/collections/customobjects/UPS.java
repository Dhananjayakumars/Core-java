package com.xworkz.collections.customobjects;

public class UPS {
	private String brand;
	private int price;
	private int capacityinVA;
	
	
	public UPS(String brand, int price, int capacityinVA) {
		super();
		this.brand = brand;
		this.price = price;
		this.capacityinVA = capacityinVA;
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


	public int getCapacityinVA() {
		return capacityinVA;
	}


	public void setCapacityinVA(int capacityinVA) {
		this.capacityinVA = capacityinVA;
	}
	
	@Override
	public String toString() {
		return "UPS [brand=" + brand + ", price=" + price + ", capacityinVA=" + capacityinVA + "]";
	}
	
	

}
