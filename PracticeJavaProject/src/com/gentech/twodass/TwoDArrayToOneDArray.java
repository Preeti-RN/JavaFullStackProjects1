package com.gentech.twodass;
//1 2 3 4 5 6 7 8 9 
public class TwoDArrayToOneDArray {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};

		int b[]=new int[3*3];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}
		for(int z=0;z<b.length;z++)
		{
			System.out.print(b[z]+" ");
		}

	}

}
