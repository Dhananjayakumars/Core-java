package com.xworkz.wrapper.classes.datatype.casting;

public class CharToIntCasting {

	public static void main(String[] args) {
		char ch='A';
		int a= (int)ch+26;
		ch=(char)a;
		System.out.println("the value of ch is "+ch);
		

	}

}
