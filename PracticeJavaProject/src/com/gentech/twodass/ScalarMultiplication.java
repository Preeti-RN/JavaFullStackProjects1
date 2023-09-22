package com.gentech.twodass;

/*

4.0 8.0 12.0 
16.0 20.0 24.0 
28.0 32.0 36.0 

 */
public class ScalarMultiplication {

	public static void main(String[] args) {
		double a[][]={{1,2,3},
			         {4,5,6},
			         {7,8,9}};
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				double b=n*a[i][j];
				System.out.print(b+" ");
				
			}
			System.out.println();
		}
		

	}

}
