package com.gentech.whilepattern;

/*
5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/
public class FiveWhile {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(5+" ");
				k++;
			}
			i--;
			System.out.println();
		}
	}

}
