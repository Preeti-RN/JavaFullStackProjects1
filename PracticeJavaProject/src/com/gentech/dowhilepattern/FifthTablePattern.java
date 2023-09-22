package com.gentech.dowhilepattern;
/*
 
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75
*/ 
public class FifthTablePattern {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		do
		{
			int k=1;
			do {
				System.out.print(num*5+" ");
				k++;
				num++;
				
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
