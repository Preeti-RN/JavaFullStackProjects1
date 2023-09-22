package com.gentech.patterns;

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/

public class OneToFivePattern {

	public static void main(String[] args) {
		for(int k=1;k<=5;k++) 
		{
			for(int i=1;i<=k;i++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
