package com.xworkz.collections.itarators;

public class SetTopBox {
	private String Brand;
	private int price;
	private boolean IsHD;
	
	public SetTopBox(String brand, int price, boolean isHD) {
		super();
		Brand = brand;
		this.price = price;
		IsHD = isHD;
	}
	
	
	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public boolean isIsHD() {
		return IsHD;
	}


	public void setIsHD(boolean isHD) {
		IsHD = isHD;
	}


	@Override
	public String toString() {
		return "SetTopBox [Brand=" + Brand + ", price=" + price + ", IsHD=" + IsHD + "]";
	}



	
	

}
