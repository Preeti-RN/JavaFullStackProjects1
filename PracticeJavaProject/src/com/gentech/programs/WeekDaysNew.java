package com.gentech.programs;

public class WeekDaysNew {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num==1) 
		
			System.out.println("Sunday");
		
		else if (num==2) {
			System.out.println("monday");
		}
		else if (num==3) {
			System.out.println("tuesday");
		}	
			
		else if (num==4) {
			System.out.println("wednesday");
		}
			
		else if (num==5) {
			System.out.println("thursday");
		}
		else if (num==6) {
			System.out.println("friday");
		}
		else if (num==7) 
			System.out.println("Saturday");
		
		else
		{
			System.out.println("invalid");
		}
		
	}
	
}
	
