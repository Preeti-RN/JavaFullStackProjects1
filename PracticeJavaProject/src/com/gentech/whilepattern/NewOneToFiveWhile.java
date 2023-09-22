package com.gentech.whilepattern;

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/
public class NewOneToFiveWhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(i+" ");
				k++;
			}i++;
			System.out.println();
		}
	}

}
