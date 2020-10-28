package com.xworkz.functionalinterface;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		
		Consumer<String>consumer=(str)->System.out.println("the name is "+str);
		consumer.accept("Dhananjay");
		
		
		Consumer<Integer>consumer2=(n)->System.out.println("the value is "+n);
		consumer2.accept(25);

	}

}
