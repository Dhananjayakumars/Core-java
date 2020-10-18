package com.xworkz.ArrayExamples.assignments;

public class FloatArray {

	public static void main(String[] args) {
		 float f[];
		    f = new float[4];
		    f[0] = 10.10f;
		    f[1] = 30.3f;
		    f[2] = 40.60f;
		    f[3] = 77.50f;
		    System.out.println("Java float Array Example");
		    
		    for(int i=0;i<f.length;i++)
		    {
		      System.out.println("Element at Index : "+ i + " is " + f[i]);
		    }

	}

}
