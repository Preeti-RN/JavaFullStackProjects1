package com.gentech.whilepattern;

/*
1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225 
*/
public class SquareWhile {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num*num+" ");
				k++;
				num++;
			}i++;
			System.out.println();
		}
	}

}
