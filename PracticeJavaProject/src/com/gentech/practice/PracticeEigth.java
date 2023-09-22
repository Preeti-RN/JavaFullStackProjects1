package com.gentech.practice;
/*
    1 
   2 2 2 
  3 3 3 3 3 
 4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
 */
public class PracticeEigth {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
