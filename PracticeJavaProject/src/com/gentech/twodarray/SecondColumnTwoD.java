package com.gentech.twodarray;
/*
 2
 5
 8
 
 */
public class SecondColumnTwoD {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		for(int i=0;i<a[0].length;i++)
		{
		
			System.out.println(a[i][1]);
		}
	}

}
