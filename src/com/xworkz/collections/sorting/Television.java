package com.xworkz.collections.sorting;

import java.util.Comparator;

public class Television implements Comparator<Television> {
	
	private String Brand;
	private int inches;
	private String type;
	
	
	public Television(String brand, int inches, String type) {
		super();
		Brand = brand;
		this.inches = inches;
		this.type = type;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Television [Brand=" + Brand + ", inches=" + inches + ", type=" + type + "]";
	}
	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
	
	
	

}
