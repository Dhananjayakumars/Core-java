package com.xworkz.collections.sorting;

public class Country implements Comparable<Country>{
	
	private int Noofstates;
	private String names;
	private int countrycode;
	
	public Country(int noofstates, String names, int countrycode) {
		super();
		Noofstates = noofstates;
		this.names = names;
		this.countrycode = countrycode;
	}
	public int getNoofstates() {
		return Noofstates;
	}
	public void setNoofstates(int noofstates) {
		Noofstates = noofstates;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "Country [Noofstates=" + Noofstates + ", names=" + names + ", countrycode=" + countrycode + "]";
	}
	@Override
	public int compareTo(Country o) {
		int res =this.Noofstates-o.Noofstates;
		return res;
	}
	
	
	
	
	
	

}
