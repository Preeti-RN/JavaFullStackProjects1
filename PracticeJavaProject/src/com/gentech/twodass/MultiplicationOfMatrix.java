package com.gentech.twodass;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{10,20,70},
				    {30,40,50}};
		int b[][]= {{1,2},
				    {3,4},
				    {5,6}};
		int aRows = a.length;
		 int aCols = a[0].length;
		 int bRows = b.length;
		 int bCols = b[0].length;
		 
		 if(aRows == bCols)
		 {
		     String c[][] = new String[aRows][bCols];
		     for(int i=0; i<aRows; i++)
		     {
		        for(int j=0; j<bCols; j++)
		        {
		        for(int k=0; k<aCols; k++) 
		        {
		         c[i][j]+= a[i][k] * b[k][j];
		         System.out.print(c[i][j]+" ");
		        }
		        System.out.println();
		        }
		   }
		  }
		 }
	}
/*
Resultant Matrix:
70 100 190 
150 220 390 
330 480 870 	
 */