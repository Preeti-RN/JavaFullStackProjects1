package com.gentech.whilepattern;

/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
public class WhileOneToFifteen {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num+" ");
				k++;
				num++;
			}i++;
			System.out.println();
			
		}
	}

}
