package com.xworkz.wrapper.classes;

public class CharWrapper {

	public static void main(String[] args) {
		
		System.out.println("program starts from here");
		
		char ch='D';
		
		Character c =new Character(ch);// boxing or wrapping
		
		System.out.println("The charector is "+c);
		
		Character chr=ch;// auto boxing
		System.out.println("the value of character is "+chr);
		
		char k=Character.valueOf(c);// unboxing
		System.out.println("the character is "+k);
		
		char j=k;// auto unboxing
		System.out.println("the character is "+j);
		
		
		
		
		
			

	}

}
