package com.gentech.whiledowhile;

public class NewSumOfOdd {

	public static void main(String[] args) {
        int i=50;
		int sum=0;
		while(i<=100)
		{ 
			if(i%2==1) {
			 
			 
			 sum=sum+i;
			}
		 i++;
		}
		
		System.out.println(sum);

	}

}
