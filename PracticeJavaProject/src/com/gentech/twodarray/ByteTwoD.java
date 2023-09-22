package com.gentech.twodarray;
/*
1 2 3 
4 5 6 
7 8 9 
 */
public class ByteTwoD {

	public static void main(String[] args) {
		byte a[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
