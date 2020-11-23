package com.xworkz.collections.treeset;

public class EarphoneTreeset {
	
	private String brand;
	private int price;
	private boolean isbluetooth;
	public EarphoneTreeset(String brand, int price, boolean isbluetooth) {
		super();
		this.brand = brand;
		this.price = price;
		this.isbluetooth = isbluetooth;
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
	public boolean isIsbluetooth() {
		return isbluetooth;
	}
	public void setIsbluetooth(boolean isbluetooth) {
		this.isbluetooth = isbluetooth;
	}
	@Override
	public String toString() {
		return "CustomTreeset [brand=" + brand + ", price=" + price + ", isbluetooth=" + isbluetooth + "]";
	}
	
	
	
	
	
	
	
	
	

}
