package com.gentech.patterns;

/*
1 
4 9 
16 25 36 
49 64 81 100
*/ 
public class SquarePattern {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++) 
			{
				System.out.print(num*num+" ");
				num++;
			}System.out.println();
		}
	}

}
