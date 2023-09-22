package com.gentech.arrayassignment;
/*
25
16
9
4
1
*/
public class SquareOfFirstTen {

	public static void main(String[] args) {
		int q[]=new int[10];
		int sq;
		int k=0;
		for(int i=1;i<=10;i++)
		{
			
			q[k]=i;
			k++;	
		}
		for(int j=(q.length-1)/2;j>=0;j--)
		{  
		{
			sq=q[j]*q[j];
		
			System.out.println(sq);
		}
		}
		

	}

}
