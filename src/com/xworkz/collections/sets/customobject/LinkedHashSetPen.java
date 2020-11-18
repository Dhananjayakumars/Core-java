package com.xworkz.collections.sets.customobject;

public class LinkedHashSetPen {
	private String brand;
	private int cost;
	private double lead;
	
	public LinkedHashSetPen(String brand, int cost, double lead) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.lead = lead;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getLead() {
		return lead;
	}

	public void setLead(double lead) {
		this.lead = lead;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", cost=" + cost + ", lead=" + lead + "]";
	}
	

}
