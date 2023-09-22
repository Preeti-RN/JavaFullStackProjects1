package com.gentech.whilepattern;

/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75
*/ 
public class FifthTableWhile {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num*5+" ");
				k++;
				num++;
			}i++;
			System.out.println();
		}
	}

}
