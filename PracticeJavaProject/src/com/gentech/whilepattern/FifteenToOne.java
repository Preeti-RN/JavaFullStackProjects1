package com.gentech.whilepattern;

/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/

public class FifteenToOne {

	public static void main(String[] args) {
		int num=15;
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num+" ");
				k++;
				num--;
			}i--;
			System.out.println();
		}
	}

}
