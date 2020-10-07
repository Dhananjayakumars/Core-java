package com.xworkz.ArrayExamples.assignments;


public class FlaskArray {

	public static void main(String[] args) {
		
		Flask[] flaskarray= new Flask[4];
		
		Flask milton=new Flask();
		milton.brand= "milton";
		milton.capacity=1.5;
		milton.material="stainless steel";
		milton.price=1200;
		flaskarray[0]=milton;
		
		Flask cello=new Flask();
		cello.brand="cello";
		cello.capacity=1.00;
		cello.material="stainless steel";
		cello.price=900;
		flaskarray[1]=cello;
		
		Flask borosil=new Flask();
		borosil.brand="borosil";
		borosil.capacity=1.25;
		borosil.material="stainless steel";
		borosil.price=1250;
		flaskarray [2]=borosil;
		
        System.out.println("Using For Loop");
		
		for(int i=0; i<flaskarray.length ; i++) {
			if(flaskarray[i] != null) {
				Flask b=flaskarray[i];
				b.Displaydetails();
				
			}
		
		
		
		
			}

	

    }
}
