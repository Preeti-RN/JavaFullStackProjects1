package com.gentech.dowhilepattern;
/*
5 
5 5 
5 5 5 
5 5 5 5 
5 5 5 5 5
*/ 
public class PatternFive {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(5+" ");
				k++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);
		

	}

}
