package com.xworkz.collections.linkedlist.customlist;

public class Hotel {
	
	private String name;
	private int noofrooms;
	private double rating;
	
	public Hotel(String name, int noofrooms, double rating) {
		super();
		this.name = name;
		this.noofrooms = noofrooms;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", noofrooms=" + noofrooms + ", rating=" + rating + "]";
	}
	
	
	
	
	

}
