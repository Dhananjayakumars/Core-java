package com.xworkz.ArrayExamples.assignments;

public class PlayersArray {

	public static void main(String[] args) {
		
		String[]player=new String[11];
		        player[0]="Devdutt Padikkal";
				player[1]= "Aaron Finch";
				player[2]= "Virat Kohli";
				player[3]= "AB de Villiers";
				player[4]= "Moeen Ali";
				player[5]="Shivam Dube";
				player[6]= "Washington Sundar";
				player[7]="Isuru Udana";
				player[8]= "Navdeep Saini";
				player[10]="Yuzvendra Chahal";
				
				System.out.println("Start of the prog");
				int length=player.length;
				
				for(int i=0; i<length; i++)
				{
				
					System.out.println("The player " + i +" is "+player[i]);
					
				}
				{
					System.out.println("end of prog");
				}
							
		

	}

}
