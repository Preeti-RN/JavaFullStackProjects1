package com.gentech.twodass;

public class OneToTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[][]=new int[3][2];
		int k=0;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			    b[i][j]=a[k];
			    k++;
			  
			}
		}
		for(int z=0;z<b.length;z++)
		{
			for(int x=0;x<b[z].length;x++)
			{
			System.out.print(b[z][x]+" ");
			}
		System.out.println();
		}

	}

}
